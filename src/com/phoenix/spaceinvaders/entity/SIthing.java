package com.phoenix.spaceinvaders.entity;

import java.applet.AudioClip;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

import com.phoenix.spaceinvaders.SI;

/**
 * Defines anything that is drawn on the panel.
 * 
 * @author William
 *
 */
public abstract class SIthing
{

    protected int xPosition;
    protected int yPosition;
    protected int width;
    protected int height;
    protected Image visual;

    /**
     * Flag variable for playing thing's sound.
     */
    protected boolean playSound;
    protected AudioClip sound;

    // *** MOVEMENT CHECKERS *** //

    /**
     * Returns true if thing can move up by the given amount of pixels.
     */
    public boolean canMoveUp( int pixels )
    {
        int newPosition = yPosition - pixels;
        if ( newPosition >= 0 ) return true;
        return false;
    }

    /**
     * Returns true if thing can move down by the given amount of pixels.
     */
    public boolean canMoveDown( int pixels )
    {
        int newPosition = yPosition - pixels;
        // Hard 75 to account for the JMenuBar
        if ( newPosition + height <= SI.height - 75 ) return true;
        return false;
    }

    /**
     * Returns true if thing can move left by the given amount of pixels.
     */
    public boolean canMoveLeft( int pixels )
    {
        int newPosition = xPosition - pixels;
        if ( newPosition >= 0 ) return true;
        return false;
    }

    /**
     * Returns true if thing can move right by the given amount of pixels.
     */
    public boolean canMoveRight( int pixels )
    {
        int newPosition = xPosition + pixels;
        if ( newPosition <= SI.width - width - pixels ) return true;
        return false;
    }

    // *** MOVEMENT *** //

    /**
     * Moves this up by the number of pixels if possible.
     */
    public void moveUp( int pixels )
    {
        if ( canMoveUp( pixels ) ) yPosition -= pixels;
    }

    /**
     * Moves this down by the number of pixels if possible.
     */
    public void moveDown( int pixels )
    {
        if ( canMoveDown( pixels ) ) yPosition += pixels;
    }

    /**
     * Moves this left by the number of pixels if possible.
     */
    public void moveLeft( int pixels )
    {
        if ( canMoveLeft( pixels ) ) xPosition -= pixels;
    }

    /**
     * Moves this right by the number of pixels if possible.
     */
    public void moveRight( int pixels )
    {
        if ( canMoveRight( pixels ) ) xPosition += pixels;
    }

    // *** ABSTRACTION *** //
    /**
     * Paints the component with the given graphic.
     */
    public abstract void paintComponent( Graphics g );

    // *** GETTERS AND SETTERS *** //

    // AUTO GENERATED BELOW
    /**
     * @return the xPosition
     */
    public int getXPosition()
    {
        return xPosition;
    }

    /**
     * @param xPosition
     *            the xPosition to set
     */
    public void setXPosition( int xPosition )
    {
        this.xPosition = xPosition;
    }

    /**
     * @return the yPosition
     */
    public int getYPosition()
    {
        return yPosition;
    }

    /**
     * @param yPosition
     *            the yPosition to set
     */
    public void setYPosition( int yPosition )
    {
        this.yPosition = yPosition;
    }

    /**
     * @return the width
     */
    public int getWidth()
    {
        return width;
    }

    /**
     * @param width
     *            the width to set
     */
    public void setWidth( int width )
    {
        this.width = width;
    }

    /**
     * @return the height
     */
    public int getHeight()
    {
        return height;
    }

    /**
     * @param height
     *            the height to set
     */
    public void setHeight( int height )
    {
        this.height = height;
    }

    /**
     * @return the visual
     */
    public Image getVisual()
    {
        return visual;
    }

    /**
     * @param visual
     *            the visual to set
     */
    public void setVisual( Image visual )
    {
        this.visual = visual;
    }

    /**
     * @return the sound
     */
    public AudioClip getSound()
    {
        return sound;
    }

    /**
     * @param sound
     *            the sound to set
     */
    public void setSound( AudioClip sound )
    {
        this.sound = sound;
    }

    /**
     * Returns the things hitbox
     */
    public Rectangle getHitbox()
    {
        return new Rectangle( xPosition, yPosition, width, height );
    }
}
