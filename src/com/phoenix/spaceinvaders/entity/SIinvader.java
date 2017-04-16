/**
 * 
 */
package com.phoenix.spaceinvaders.entity;

import java.awt.Image;

/**
 * @author William
 *
 */
public abstract class SIinvader extends SIship
{
    protected boolean swap = true;

    protected int value;

    protected Image aliveAlt;

    /**
     * true is right, false is left
     */
    protected boolean direction = false;

    public void swap()
    {
        visual = swap ? alive : aliveAlt;
        swap = !swap;
    }

    // *** GETTERS AND SETTERS *** //

    // AUTO GENERATED BELOW

    /**
     * @return the value
     */
    public int getValue()
    {
        return value;
    }

    /**
     * @param value
     *            the value to set
     */
    public void setValue( int value )
    {
        this.value = value;
    }

    /**
     * @return the direction
     */
    public boolean isMovingRight()
    {
        return direction;
    }

    /**
     * @param direction
     *            the direction to set
     */
    public void setDirection( boolean direction )
    {
        this.direction = direction;
    }

    /**
     * @param direction
     *            flips the direction
     */
    public void changeDirection()
    {
        direction = !direction;
    }
    
    public String toString()
    {
        return "|" + xPosition + ", " + yPosition + "|";
    }
}
