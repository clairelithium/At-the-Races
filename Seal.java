import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Seal is an actor that is part of the Participants class, where acts during the game and runs across the track.
 * 
 * @author Claire Li 
 * @version 05/03/2024
 */
public class Seal extends Participant
{
    public int Number = 2;
    private int startRotation;
    
    /**
     * Seal - Constructor that detects the original rotation
     */
    public Seal()
    {
        startRotation = getRotation();    
    }

    /**
     * Act - do whatever the Bear wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        race();
        checkTouching();
        endGame();
    }

    /**
     * endGame - when the finish line is touched by its center, then 
     * the game ends, has an audio playing, and provides a text announcing
     * the end of the game
     */
    public void endGame()
    {
        if (canSee (Finish.class))
        {
            Greenfoot.playSound("Fireworks.wav");
            int Numbers = Number;
            Instructions instruct = new Instructions(Numbers);
            getWorld().addObject(instruct, 400, 300);            
            Greenfoot.stop();
        }
    }

    /**
     * checkTouching - the actor detects the touching and canSee method of the Projectile and Obstacles class
     */
    public void checkTouching()
    {
        if (isTouching (Projectile.class))
        {
            setLocation(50,200);
            setRotation(startRotation);
            Greenfoot.playSound("ChineseGong.wav");
        }
        if (canSee (Obstacles.class))
        {
            if (getY() <= 300) 
            {
                topSide();
            }
            else 
            {
                bottomSide();
            }
        }
    }
}
