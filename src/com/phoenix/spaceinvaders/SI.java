package com.phoenix.spaceinvaders;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

import com.phoenix.util.ResourceUtil;

/**
 * Contains the main method for execution of the program. This program is design
 * to create and launch a basic, but configurable Space Invaders based on 2011
 * Space Invaders project for CPSC 250.
 * 
 * @author William
 *
 */
public class SI extends JFrame
{
    private static final long serialVersionUID = 1L;

    public static final int width = ResourceUtil.getInt( SI.class, "game.width", 500 );
    public static final int height = ResourceUtil.getInt( SI.class, "game.height", 450 );
    public static final String optionsString = ResourceUtil.getString( SI.class, "optionsString", "Options" );
    public static final String newGameString = ResourceUtil.getString( SI.class, "newGameString", "New Game" );
    public static final String pauseString = ResourceUtil.getString( SI.class, "pauseString", "Pause" );
    public static final String resumeString = ResourceUtil.getString( SI.class, "resumeString", "Resume" );
    public static final String exitString = ResourceUtil.getString( SI.class, "exitString", "Exit" );
    public static final String helpString = ResourceUtil.getString( SI.class, "helpString", "Help" );
    public static final String aboutString = ResourceUtil.getString( SI.class, "aboutString", "About" );
    public static final String confirmString = ResourceUtil.getString( SI.class, "confirmString", "Confirm" );
    public static final String playNewGameString = ResourceUtil
            .getString( SI.class, "playNewGameString", "Do you want to play a new game?" );
    public static final String dareToQuitString = ResourceUtil.getString( SI.class, "quiteString", "Dare to Quit?" );

    protected static final Image defaultIcon = ResourceUtil
            .getImage(
                    SI.class,
                    "icon.gif",
                    "R0lGODlhHgAYAPcAAAAAAP///wAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACH5BAEAAP8ALAAAAAAeABgAAAhxAP8JHEiwoMGDCBMqXMiwocOHCAMEUCgRYsWEFylOHJiR40aBHQl2DPlv5MeCFyWqXMkS5EmRG1nKVOkyIksAAGTilGlz5c6bOVsenEl0Zs+iSDUi5blwqdGGJGFafImSqk2HUatitQqxq9evYMMiDAgAOw==" );
    
    protected JMenuBar menu;
    protected JMenu options;
    protected JMenuItem newGame;
    protected JMenuItem pause;
    protected JMenuItem resume;
    protected JMenuItem exit;
    protected SIPanel panel;
    protected JMenu help;
    protected JMenuItem about;

    public SI()
    {
        super( ResourceUtil.getString( SI.class, "game.title", "Space Invaders" ) );
        init();
    }

    /**
     * Initialization of the class.
     */
    protected void init()
    {
        setResizable( false );
        setSize( new Dimension( width, height ) );
        setLocationRelativeTo( null );
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        setResizable( false );
        setVisible( true );
        setIconImage( defaultIcon );
        setupComponents();
        layoutComponents();
    }

    /**
     * Setups up and configures any components this program will use.
     */
    protected void setupComponents()
    {
        panel = new SIPanel();

        menu = new JMenuBar();
        // Options
        options = new JMenu( optionsString );

        newGame = new JMenuItem( newGameString );
        newGame.setMnemonic( KeyEvent.VK_N );
        newGame.setAccelerator( KeyStroke.getKeyStroke( KeyEvent.VK_N, ActionEvent.CTRL_MASK ) );

        pause = new JMenuItem( pauseString );
        pause.setMnemonic( KeyEvent.VK_P );
        pause.setAccelerator( KeyStroke.getKeyStroke( KeyEvent.VK_P, ActionEvent.CTRL_MASK ) );

        resume = new JMenuItem( resumeString );
        resume.setMnemonic( KeyEvent.VK_R );
        resume.setAccelerator( KeyStroke.getKeyStroke( KeyEvent.VK_R, ActionEvent.CTRL_MASK ) );

        exit = new JMenuItem( exitString );
        exit.setMnemonic( KeyEvent.VK_Q );
        exit.setAccelerator( KeyStroke.getKeyStroke( KeyEvent.VK_Q, ActionEvent.CTRL_MASK ) );

        // Help
        help = new JMenu( helpString );

        about = new JMenuItem( aboutString );
        about.setMnemonic( KeyEvent.VK_H );
        about.setAccelerator( KeyStroke.getKeyStroke( KeyEvent.VK_H, ActionEvent.CTRL_MASK ) );

        // Listeners
        newGame.addActionListener( new ActionListener()
        {
            public void actionPerformed( ActionEvent event )
            {
                panel.pause();
                if ( JOptionPane.showConfirmDialog( null, playNewGameString, confirmString, JOptionPane.YES_NO_OPTION ) == 0 )
                    panel.newGame( true );
                panel.resume();
            }
        } );

        pause.addActionListener( new ActionListener()
        {
            public void actionPerformed( ActionEvent event )
            {
                panel.pause();
            }
        } );

        resume.addActionListener( new ActionListener()
        {
            public void actionPerformed( ActionEvent event )
            {
                panel.resume();
            }
        } );

        exit.addActionListener( new ActionListener()
        {
            public void actionPerformed( ActionEvent event )
            {
                panel.pause();
                if ( JOptionPane.showConfirmDialog( null, dareToQuitString, confirmString, JOptionPane.YES_NO_OPTION ) == 0 )
                    System.exit( 0 );
                panel.resume();
            }
        } );

        about.addActionListener( new ActionListener()
        {
            public void actionPerformed( ActionEvent event )
            {
                panel.pause();
                JOptionPane.showMessageDialog( SI.this, new JLabel( "<html><hr>Space Invaders<br>by William H<hr></html>" ), aboutString
                        + "...", JOptionPane.INFORMATION_MESSAGE );
                panel.resume();
            }
        } );
    }

    /**
     * Lays out the components for the program.
     */
    protected void layoutComponents()
    {
        options.add( newGame );
        options.addSeparator();
        options.add( pause );
        options.add( resume );
        options.addSeparator();
        options.add( exit );
        menu.add( options );

        help.add( about );
        menu.add( Box.createHorizontalGlue() );
        menu.add( help );

        setJMenuBar( menu );

        add( panel );
        addKeyListener( panel );
        validate();
    }

    public static void main( String args[] )
    {
        new SI();
    }

}
