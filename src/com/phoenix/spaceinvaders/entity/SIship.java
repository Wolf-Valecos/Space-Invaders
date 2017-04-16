/**
 * 
 */
package com.phoenix.spaceinvaders.entity;

import java.applet.AudioClip;
import java.awt.Image;

import com.phoenix.spaceinvaders.entity.instance.SImissile;

/**
 * Holds the shared ship attributes between invaders and the base.
 * 
 * @author William
 */
public abstract class SIship extends SIthing
{
    protected boolean isHit;
    protected AudioClip destroySound;
    protected Image alive;
    protected Image destroyed;

    protected void init()
    {
        isHit = false;
        playSound = true;
        visual = alive;
        width = visual.getWidth( null );
        height = visual.getHeight( null );

    }

    /**
     * Returns if this ship has been destroyed
     */
    public boolean isHit()
    {
        return isHit;
    }

    /**
     * Returns whether or not the ship has been hit by the given missile.
     */
    public boolean isHit( SImissile missile )
    {
        if ( missile == null ) return false;
        return getHitbox().intersects( missile.getHitbox() );
        // return missile.getXPosition() >= xPosition && missile.getXPosition()
        // <= xPosition + width && missile.getYPosition() >= yPosition
        // && missile.getYPosition() <= yPosition + height;
    }

    /**
     * Changes animation and plays hit sound to destroy ship.
     */
    public void destroyShip()
    {
        isHit = true;
        if ( destroySound != null ) destroySound.play();
        visual = destroyed;
    }

}
