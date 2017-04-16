package com.phoenix.spaceinvaders;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.MessageFormat;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.Timer;

import com.phoenix.spaceinvaders.entity.SIinvader;
import com.phoenix.spaceinvaders.entity.instance.SIbase;
import com.phoenix.spaceinvaders.entity.instance.SIbottom;
import com.phoenix.spaceinvaders.entity.instance.SImiddle;
import com.phoenix.spaceinvaders.entity.instance.SImissile;
import com.phoenix.spaceinvaders.entity.instance.SImystery;
import com.phoenix.spaceinvaders.entity.instance.SItop;
import com.phoenix.util.ResourceUtil;

/**
 * This is the main panel used by the {@link SI} class. This class will keep
 * track of invaders, missiles, the base, mystery ship, score, and events
 * received
 * from the user.
 * 
 * @author William
 *
 */
public class SIPanel extends JPanel implements ActionListener, KeyListener
{
    private static final long serialVersionUID = 1L;

    protected static final String scoreString = ResourceUtil.getString( SIPanel.class, "scoreString", "Score: {0}" );
    protected static final int scoreFontSize = ResourceUtil.getInt( SIPanel.class, "scoreFontSize", 16 );
    protected static final String pauseString = ResourceUtil.getString( SIPanel.class, "pauseString", "Paused" );
    protected static final String gameOverString = ResourceUtil.getString( SIPanel.class, "gameOverString", "Game Over" );
    protected static final int gameOverFontSize = ResourceUtil.getInt( SIPanel.class, "gameOverFontSize", 32 );
    protected static final int clearWaveBonus = ResourceUtil.getInt( SIPanel.class, "clearWaveBonus", 5 );

    protected static final int invaderMissleAmount = ResourceUtil.getInt( SIPanel.class, "invaderMissleAmount", 4 );
    protected static final int invaderMissleChanceOneOutOf = ResourceUtil.getInt( SIPanel.class, "invaderMissleChanceOneOutOf", 500 );
    protected static final int invaderMissleSpeed = ResourceUtil.getInt( SIPanel.class, "invaderMissleSpeed", 5 );
    protected static final int invaderDownwardMovementRate = ResourceUtil.getInt( SIPanel.class, "invaderDownwardMovementRate", 12 );
    protected static final int invaderRightMovementRate = ResourceUtil.getInt( SIPanel.class, "invaderRightMovementRate", 5 );
    protected static final int invaderLeftMovementRate = ResourceUtil.getInt( SIPanel.class, "invaderLeftMovementRate", 5 );
    protected static final int invaderDifficultyPercentCurve = ResourceUtil.getInt( SIPanel.class, "invaderDifficultyPercentCurve", 20 );

    protected static final int invaderMysteryRightMovementRate = ResourceUtil.getInt( SIPanel.class, "invaderMysteryRightMovementRate", 5 );
    protected static final int invaderMysteryLeftMovementRate = ResourceUtil.getInt( SIPanel.class, "invaderMysteryLeftMovementRate", 5 );
    protected static final int invaderMysterySpawnChanceOneOutOf = ResourceUtil.getInt( SIPanel.class, "invaderMysterySpawnChanceOneOutOf",
            333 );

    protected static final int baseMissleSpeed = ResourceUtil.getInt( SIPanel.class, "baseMissleSpeed", 5 );
    protected static final int baseRightMovementRate = ResourceUtil.getInt( SIPanel.class, "baseRightMovementRate", 5 );
    protected static final int baseLeftMovementRate = ResourceUtil.getInt( SIPanel.class, "baseLeftMovementRate", 5 );

    protected int score;

    protected int pulse;

    protected Timer timer;

    protected SIinvader invaders[][];

    protected SImissile invaderMissile[];

    protected SImystery mystery;

    protected int invaderCount;

    protected int invaderPulse;

    protected SIbase base;

    // Boolean flags for movement
    protected boolean baseLeft;

    protected boolean baseRight;

    protected SImissile baseMissile;

    public SIPanel()
    {
        init();
    }

    protected void init()
    {
        baseLeft = false;
        baseRight = false;

        invaders = new SIinvader[5][10];
        invaderPulse = 0;
        // Create a mystery entity just to spawn assets.
        new SImystery( 0, 0, false );

        timer = new Timer( 10, this );
        setBackground( Color.black );
        newGame( true );
    }

    // *** HELPER METHODS *** //

    /**
     * This will refill the invaders, used for new games.
     */
    protected void fillInvaders()
    {
        // Hehe..
        SIinvader spacerInvader = new SItop( 0, 0 );
        invaderCount = 0;
        int spacingHorizontal = 5;
        int spacingVertical = 1;

        int middle = SI.width / 2;

        int x, y = (int) ( SI.height * 0.2 );
        for ( int i = 0; i < invaders.length; i++ )
        {
            x = (int) ( middle - ( 4.5 * spacerInvader.getWidth() ) );
            for ( int j = 0; j < invaders[i].length; j++ )
            {
                invaderCount++;
                switch ( i )
                {
                    case ( 0 ) :
                        invaders[i][j] = new SItop( x, y );
                        break;
                    case ( 1 ) :
                    case ( 2 ) :
                        invaders[i][j] = new SImiddle( x, y );
                        break;
                    case ( 3 ) :
                    case ( 4 ) :
                        invaders[i][j] = new SIbottom( x, y );
                        break;
                }
                x += spacingHorizontal + spacerInvader.getWidth();
            }
            y += spacerInvader.getHeight() + spacingVertical;
        }
    }

    // *** GAME OPTIONS *** //
    /**
     * Starts a new game
     */
    public void newGame( boolean wipeScore )
    {
        score = wipeScore ? 0 : score + clearWaveBonus;
        if ( wipeScore ) base = new SIbase();
        baseMissile = null;
        mystery = null;
        invaderMissile = new SImissile[invaderMissleAmount];
        fillInvaders();
        timer.start();
    }

    /**
     * Pauses the game clock
     */
    public void pause()
    {
        timer.stop();
    }

    /**
     * Resumes the game clock
     */
    public void resume()
    {
        timer.start();
    }

    // ** MOVEMENT AND CONTROLS ** //

    /**
     * {@inheritDoc}
     */
    @Override
    public void keyPressed( KeyEvent e )
    {
        switch ( e.getKeyCode() )
        {
        // Base Movement
            case KeyEvent.VK_RIGHT :
                baseRight = true;
                break;
            case KeyEvent.VK_LEFT :
                baseLeft = true;
                break;
            // Fire Missile
            case KeyEvent.VK_SPACE :
                if ( baseMissile == null && !base.isHit() )
                {
                    base.playSound();
                    baseMissile = new SImissile( base.getXPosition() + base.getWidth() / 2, base.getYPosition() );
                    // Make a small adjustment since we don't know our width
                    // before the missile is created
                    baseMissile.setXPosition( baseMissile.getXPosition() - baseMissile.getWidth() / 2 );
                }
                else if ( base.isHit() ) newGame( true );
                break;

        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void keyReleased( KeyEvent e )
    {
        // Base Movement
        switch ( e.getKeyCode() )
        {
            case KeyEvent.VK_RIGHT :
                baseRight = false;
                break;
            case KeyEvent.VK_LEFT :
                baseLeft = false;
                break;
        }

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void keyTyped( KeyEvent arg0 )
    {}

    /**
     * Moves the invaders to the right
     */
    protected void moveRight( int pixels )
    {
        for ( SIinvader[] invaders : this.invaders )
            for ( SIinvader invader : invaders )
                if ( invader != null ) invader.moveRight( pixels );
    }

    /**
     * Moves the invaders to the left
     */
    protected void moveLeft( int pixels )
    {
        for ( SIinvader[] invaders : this.invaders )
            for ( SIinvader invader : invaders )
                if ( invader != null ) invader.moveLeft( pixels );
    }

    /**
     * Moves the invaders to the down
     */
    protected void moveDown( int pixels )
    {
        for ( SIinvader[] invaders : this.invaders )
            for ( SIinvader invader : invaders )
                if ( invader != null ) invader.moveDown( pixels );
    }

    /**
     * Checks if the invader cluster can keep going right, checks from the left
     * column first
     */
    protected boolean canMoveRight( int pixel )
    {
        for ( int i = 0; i < invaders[0].length; i++ )
            for ( int j = 0; j < invaders.length; j++ )
                if ( invaders[j][i] != null && !invaders[j][i].canMoveRight( pixel ) ) return false;
        return true;
    }

    /**
     * Checks if the invader cluster can keep going left, checks from the right
     * column first
     */
    protected boolean canMoveLeft( int pixel )
    {
        for ( int i = invaders[0].length - 1; i >= 0; i-- )
            for ( int j = invaders.length - 1; j >= 0; j-- )
                if ( invaders[j][i] != null && !invaders[j][i].canMoveLeft( pixel ) ) return false;
        return true;
    }

    /**
     * Checks if the invader cluster can keep going down, checks from the bottom
     * row first
     */
    protected boolean canMoveDown( int pixel )
    {
        for ( int i = invaders.length - 1; i >= 0; i-- )
            for ( int j = 0; j < invaders[i].length; j++ )
                if ( invaders[i][j] != null && !invaders[i][j].canMoveDown( pixel ) ) return false;
        return true;
    }

    /**
     * Changes the invaders direction
     */
    protected void changeDirection()
    {
        for ( SIinvader[] invaders : this.invaders )
            for ( SIinvader invader : invaders )
                if ( invader != null ) invader.changeDirection();
    }

    // *** Invader Specific *** //
    /**
     * Swaps the invaders images and clears destroyed invaders
     */
    protected void updateInvaders()
    {
        invaderCount = 0;
        // Clear other invaders
        for ( int i = 0; i < this.invaders.length; i++ )
            for ( int j = 0; j < this.invaders[i].length; j++ )
                if ( invaders[i][j] != null )
                {
                    if ( invaders[i][j].isHit() )
                    {
                        invaders[i][j] = null;
                        continue;
                    }
                    invaders[i][j].swap();
                    invaderCount++;
                }

    }

    /**
     * Checks if any invaders have been hit by the base missile, if so destroys
     * it
     */
    protected void destroyInvaders()
    {
        // Clear mystery
        if ( mystery != null && mystery.isHit() ) mystery = null;
        // Destroy mystery
        if ( mystery != null && mystery.isHit( baseMissile ) )
        {
            mystery.destroyShip();
            score += mystery.getValue();
            baseMissile = null;
        }

        // Destroy other invaders
        for ( int i = 0; i < this.invaders.length; i++ )
            for ( int j = 0; j < this.invaders[i].length; j++ )
                if ( invaders[i][j] != null && invaders[i][j].isHit( baseMissile ) )
                {
                    invaders[i][j].destroyShip();
                    score += invaders[i][j].getValue();
                    baseMissile = null;
                }
    }

    /**
     * Checks if any invader is touching the base giving a gameover
     */
    protected boolean baseInvaded()
    {
        for ( int i = 0; i < invaderMissile.length; i++ )
            if ( invaderMissile[i] != null && base.isHit( invaderMissile[i] ) ) return true;
        for ( int i = invaders.length - 1; i >= 0; i-- )
            for ( int j = 0; j < invaders[i].length; j++ )
                if ( invaders[i][j] != null && invaders[i][j].getHitbox().intersects( base.getHitbox() ) ) return true;
        return false;
    }

    /**
     * Returns if the given invader at row, column is blocked.
     * 
     * @return
     */
    protected boolean isBlocked( int row, int column )
    {
        // Edge case for speedup, always able to shoot if bottom row
        if ( invaders[row][column] != null && row == invaders.length - 1 ) return false;
        return invaders[row + 1][column] != null;
    }

    /**
     * Fires a missile if possible
     */
    protected void fireMissile()
    {
        for ( int i = invaders.length - 1; i >= 0; i-- )
            for ( int j = 0; j < invaders[i].length; j++ )
                if ( invaders[i][j] != null && !isBlocked( i, j ) && new Random().nextInt( invaderMissleChanceOneOutOf ) == 1 )
                    for ( int k = 0; k < invaderMissile.length; k++ )
                        if ( invaderMissile[k] == null )
                        {
                            invaderMissile[k] = new SImissile( invaders[i][j].getXPosition() + invaders[i][j].getWidth() / 2,
                                    invaders[i][j].getYPosition() );
                            break;
                        }

    }

    /**
     * Returns the first SIinvader it finds, if one is found.
     */
    protected SIinvader findInvader()
    {
        for ( SIinvader[] invaders : this.invaders )
            for ( SIinvader invader : invaders )
                if ( invader != null ) return invader;
        return null;
    }

    // *** GAME ENGINE AND ACTIONS *** //

    /**
     * {@inheritDoc}
     */
    public void paintComponent( Graphics g )
    {
        super.paintComponent( g );

        // Draw a missile if one is created
        if ( baseMissile != null ) baseMissile.paintComponent( g );

        // Draw invader missiles
        for ( SImissile missile : invaderMissile )
            if ( missile != null ) missile.paintComponent( g );

        // Draw invaders
        for ( SIinvader[] invaderRow : invaders )
            for ( SIinvader invader : invaderRow )
                if ( invader != null ) invader.paintComponent( g );

        // // Draw hitboxs
        // for ( SIinvader[] invaderRow : invaders )
        // for ( SIinvader invader : invaderRow )
        // if ( invader != null )
        // {
        // g.setColor( Color.red );
        // Rectangle hb = invader.getHitbox();
        // g.fillRect( hb.x, hb.y, hb.width, hb.height );
        // }
        // if ( baseMissile != null )
        // {
        // g.setColor( Color.blue );
        // Rectangle hb = baseMissile.getHitbox();
        // g.fillRect( hb.x, hb.y, hb.width, hb.height );
        // }

        // Draw base
        base.paintComponent( g );

        // Draw mystery ship
        if ( mystery != null ) mystery.paintComponent( g );

        String scoreString = MessageFormat.format( SIPanel.scoreString, score );
        g.setColor( Color.GREEN );
        // Score Label
        FontMetrics fm = g.getFontMetrics();
        // length will adjust itself thanks to FontMetrics
        int scoreWidth = fm.stringWidth( scoreString );
        if ( !timer.isRunning() )
        {
            setFont( new Font( "Serif", Font.BOLD, gameOverFontSize ) );
            String gameStatus = base.isHit() ? gameOverString : pauseString;

            // length will adjust itself thanks to FontMetrics
            int gameStatusWidth = fm.stringWidth( gameStatus );

            g.drawString( gameStatus, SI.width / 2 - gameStatusWidth / 2, 90 );
            g.drawString( scoreString, getWidth() / 2 - scoreWidth / 2, 90 + 32 );
        }
        else
        {
            setFont( new Font( "Serif", Font.BOLD, scoreFontSize ) );
            g.drawString( scoreString, getWidth() - scoreWidth, 15 );
        }

    }

    /**
     * Main game logic occurs in this method.
     */
    @Override
    public void actionPerformed( ActionEvent e )
    {
        pulse++;
        // Invader used for movement and game end check
        SIinvader invader = findInvader();
        // End game checks
        // Won
        if ( invader == null )
        {
            newGame( false );
            return;
        }
        // Lost
        if ( !canMoveDown( invaderDownwardMovementRate ) || base.isHit() || baseInvaded() )
        {
            base.destroyShip();
            timer.stop();
            return;
        }

        // Invader Movement
        if ( pulse % ( invaderPulse > 0 ? invaderPulse : 1 ) == 0 )
        {
            updateInvaders();
            if ( invader.isMovingRight() )
                if ( canMoveRight( invaderRightMovementRate ) )
                    moveRight( invaderRightMovementRate );
                else
                {
                    changeDirection();
                    moveDown( invaderDownwardMovementRate );
                }
            else if ( canMoveLeft( invaderLeftMovementRate ) )
                moveLeft( invaderLeftMovementRate );
            else
            {
                changeDirection();
                moveDown( invaderDownwardMovementRate );
            }
        }
        invaderPulse = (int) ( invaderCount - invaderCount * ( invaderDifficultyPercentCurve / 100 ) );

        // Missile and Mystery Movement
        if ( pulse % 2 == 0 )
        {
            // Missile Movement
            if ( baseMissile != null && baseMissile.canMoveUp( baseMissleSpeed ) )
                baseMissile.moveUp( baseMissleSpeed );
            else
                baseMissile = null;

            // Move Missiles
            for ( int i = 0; i < invaderMissile.length; i++ )
                if ( invaderMissile[i] != null && invaderMissile[i].canMoveDown( invaderMissleSpeed ) )
                    invaderMissile[i].moveDown( invaderMissleSpeed );
                else
                    invaderMissile[i] = null;

            // Destroy any invaders
            destroyInvaders();

            // Mystery Ship Movement
            if ( mystery != null )
            {
                mystery.swap();
                if ( mystery.isMovingRight() )
                    if ( mystery.canMoveRight( invaderMysteryRightMovementRate ) )
                        mystery.moveRight( invaderMysteryRightMovementRate );
                    else
                        mystery = null;
                else if ( mystery.canMoveLeft( invaderMysteryLeftMovementRate ) )
                    mystery.moveLeft( invaderMysteryLeftMovementRate );
                else
                    mystery = null;
            }
        }
        // Mystery spawn chance
        if ( mystery == null ) if ( new Random().nextInt( invaderMysterySpawnChanceOneOutOf ) == 1 ) if ( new Random().nextInt( 2 ) > 0 )
            mystery = new SImystery( 0, (int) ( SI.height * 0.1 ), true );
        else
            mystery = new SImystery( SI.width, (int) ( SI.height * 0.1 ), false );

        // Missile spawn chance
        fireMissile();
        // Base Movement
        if ( baseRight && base.canMoveRight( baseRightMovementRate ) ) base.moveRight( baseRightMovementRate );
        if ( baseLeft && base.canMoveLeft( baseLeftMovementRate ) ) base.moveLeft( baseLeftMovementRate );

        repaint();
    }
}
