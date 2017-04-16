package com.phoenix.util;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.reflect.Field;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioFileFormat.Type;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.xml.bind.DatatypeConverter;

/**
 * Utility class that allows access to external files, will load it's own
 * configuration for string property files. This class will also allow access to
 * external resources based upon the package setup.
 * 
 * @author William
 *
 */
public class ResourceUtil
{

    protected static Locale locale = new Locale( "en", "US" );
    protected static String resourceFolder = "rsrc";
    protected static String fileEnding = ".properties";
    protected static char divider = '/';
    protected static String imageFolder = "images";
    protected static String audioFolder = "audio";

    protected ResourceUtil()
    {}

    public static void setLocale( String language, String location )
    {
        locale = new Locale( language, location );
    }

    /**
     * Returns an int, if the int cannot be found the default value is used
     * instead.
     */
    public static int getInt( Class<?> clazz, String key, int defaultValue )
    {
        return getInt( clazz, clazz, key, defaultValue );
    }

    /**
     * Returns an int, if the int cannot be found the default value is used
     * instead.
     */
    public static int getInt( Class<?> packageClazz, Class<?> keyClazz, String key, int defaultValue )
    {
        String convertNumber = getString( packageClazz, keyClazz, key, defaultValue + "" );
        try
        {
            return Integer.parseInt( convertNumber );
        }
        catch ( NumberFormatException e )
        {
            return defaultValue;
        }
    }

    /**
     * Returns a color, if the color cannot be found the default value is used
     * instead.
     */
    public static Color getColor( Class<?> clazz, String key, Color defaultValue )
    {
        return getColor( clazz, clazz, key, defaultValue );
    }

    /**
     * Returns an color, if the color cannot be found the default value is used
     * instead.
     */
    public static Color getColor( Class<?> packageClazz, Class<?> keyClazz, String key, Color defaultValue )
    {
        String convertColor = getString( packageClazz, keyClazz, key, defaultValue.toString() );
        try
        {
            Field field = Class.forName( "java.awt.Color" ).getField( convertColor );
            return (Color) field.get( null );

        }
        catch ( Exception e )
        {
            return defaultValue;
        }

    }

    /**
     * Returns a String, if the String cannot be found the default value is used
     * instead.
     */
    public static String getString( Class<?> clazz, String key, String defaultValue )
    {
        return getString( clazz, clazz, key, defaultValue );
    }

    /**
     * Returns a String, if the String cannot be found the default value is used
     * instead.
     */
    public static String getString( Class<?> packageClazz, Class<?> keyClazz, String key, String defaultValue )
    {
        String pkg = packageClazz.getPackage().getName();
        String cls;
        String bundle = resourceFolder + divider + pkg.replace( '.', divider ) + '-' + locale.toString() + fileEnding;
        pkg = keyClazz.getPackage().getName();
        cls = keyClazz.getName().substring( pkg.length() + 1 );
        String trueKey = cls + "." + key;
        try
        {
            File file = new File( bundle );
            File directory = new File( file.getParent() );
            URL[] urls = { directory.toURI().toURL() };
            ClassLoader loader = new URLClassLoader( urls );
            return ResourceBundle.getBundle( file.getName().replace( fileEnding, "" ), locale, loader ).getString( trueKey );
        }
        catch ( Exception e )
        {
            System.err.println( "Not Found Error in \"" + bundle + "\": " + trueKey + "=" + defaultValue + " adding property to file." );
            addValue( new File( bundle ), trueKey + "=" + defaultValue );
            return defaultValue;
        }
    }

    /**
     * Returns an audio clip, if the audio clip cannot be found, null is
     * returned instead.
     */
    public static AudioClip getAudio( Class<?> clazz, String fileName, String defaultAudio )
    {
        return getAudio( clazz, clazz, fileName, defaultAudio );
    }

    /**
     * Returns an audio clip, if the audio clip cannot be found, null is
     * returned instead.
     */
    public static AudioClip getAudio( Class<?> packageClazz, Class<?> keyClazz, String fileName, String defaultAudio )
    {
        String pkg = packageClazz.getPackage().getName();
        String cls = keyClazz.getName().substring( keyClazz.getPackage().getName().length() + 1 );
        String filePath = resourceFolder + divider + pkg.replace( '.', divider ) + divider + cls + divider + audioFolder + divider
                + fileName;
        File file = new File( filePath );
        if ( !file.exists() )
        {
            System.err.print( "No file found at '" + filePath + "'" );
            if ( defaultAudio == null )
            {
                System.err.println();
                return null;
            }
            System.err.println( " creating Audio file." );
            if ( convertBase64ToAudioFile( defaultAudio, file ) == null ) return null;
            return getAudio( packageClazz, keyClazz, fileName, defaultAudio );
        }
        else
            try
            {
                return Applet.newAudioClip( file.toURI().toURL() );
            }
            catch ( MalformedURLException e )
            {
                System.err.println( "No file found at '" + filePath + "'" );
                return null;
            }
    }

    /**
     * Returns an image, if the image cannot be found, null is
     * returned instead.
     */
    public static Image getImage( Class<?> clazz, String fileName, String defaultImage )
    {
        return getImage( clazz, clazz, fileName, defaultImage );
    }

    /**
     * Returns an image, if the image cannot be found, null is
     * returned instead.
     */
    public static Image getImage( Class<?> packageClazz, Class<?> keyClazz, String fileName, String defaultImage )
    {
        String pkg = packageClazz.getPackage().getName();
        String cls = keyClazz.getName().substring( keyClazz.getPackage().getName().length() + 1 );
        String filePath = resourceFolder + divider + pkg.replace( '.', divider ) + divider + cls + divider + imageFolder + divider
                + fileName;
        File file = new File( filePath );
        if ( !file.exists() )
        {
            System.err.print( "No file found at '" + filePath + "'" );
            if ( defaultImage == null )
            {
                System.err.println();
                return null;
            }
            System.err.println( " creating Image file." );
            Image image = convertBase64ToImage( defaultImage );
            createImage( file, image );
            return image;
        }
        else
            try
            {
                return new ImageIcon( file.toURI().toURL() ).getImage();
            }
            catch ( MalformedURLException e )
            {
                System.err.println( "No file found at '" + filePath + "'" );
                return convertBase64ToImage( defaultImage );
            }
    }

    /**
     * Converts the value into base 64. Returns null if unable to.
     */
    public static Image convertBase64ToImage( String base64 )
    {
        if ( base64 == null ) return null;
        byte[] imageBytes = DatatypeConverter.parseBase64Binary( base64 );
        BufferedImage img = null;
        try
        {
            img = ImageIO.read( new ByteArrayInputStream( imageBytes ) );
        }
        catch ( IOException e )
        {
            System.err.println( "Unable to parse given base64." );
            e.printStackTrace();
        }
        return img;
    }

    /**
     * Converts the value into base 64 then turns it into a wav file with the
     * given filename. Returns null if unable to.
     */
    public static File convertBase64ToAudioFile( String base64, File file )
    {
        if ( base64 == null ) return null;
        byte[] audioBytes = DatatypeConverter.parseBase64Binary( base64 );
        String extension = file.getName().lastIndexOf( '.' ) > 0 ? file.getName().substring( file.getName().lastIndexOf( '.' ) + 1 ) : "";
        if ( !extension.equals( "wav" ) ) return null;
        AudioInputStream ais;
        try
        {
            // Create file directories
            if ( !file.exists() ) new File( file.getParent() ).mkdirs();
            if ( !file.exists() ) file.createNewFile();
            ais = AudioSystem.getAudioInputStream( new ByteArrayInputStream( audioBytes ) );
            AudioSystem.write( ais, Type.WAVE, file );
        }
        catch ( UnsupportedAudioFileException | IOException | SecurityException e )
        {
            System.err.println( "Unable to parse given base64." );
            e.printStackTrace();
        }
        return file;
    }

    /**
     * Adds a value to the specified file.
     */
    public static void addValue( File file, String value )
    {
        // Create file directories
        if ( !file.exists() ) new File( file.getParent() ).mkdirs();

        try ( BufferedWriter writer = new BufferedWriter( new OutputStreamWriter( new FileOutputStream( file.getAbsolutePath(), true ),
                "UTF-8" ) ) )
        {
            writer.append( value );
            writer.newLine();
        }
        catch ( Exception e )
        {
            System.err.println( "Something happen with writing" );
            e.printStackTrace();
        }
    }

    /**
     * Creates an image file.
     */
    public static void createImage( File file, Image image )
    {
        // Create file directories
        if ( !file.exists() ) new File( file.getParent() ).mkdirs();
        try
        {
            ImageIO.write( (RenderedImage) image,
                    file.getName().lastIndexOf( '.' ) > 0 ? file.getName().substring( file.getName().lastIndexOf( '.' ) + 1 ) : "gif", file );
        }
        catch ( IOException e )
        {
            e.printStackTrace();
        }
    }
}
