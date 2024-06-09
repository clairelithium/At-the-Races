import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Participant is a class that consists of 4 other subactors: the bear, seal, sheep, and turtle. 
 * 
 * @author Claire Li 
 * @version 05/03/2024
 */
public class Participant extends Actor
{
    public int imgNumber = 0;
    private int minNumber = 1;    
    private int speed = Greenfoot.getRandomNumber(2) + 1;
    private Counter myCounter;

    /**
     * Constructor - build the ball object with a counter object passed to it
     */
    public Participant(Counter counter)
    {   
        myCounter = counter;
    }

    /**
     * Constructor default - Builds the ball object to start at a random rotation
     */
    public Participant()
    {
        imgNumber = minNumber;
    }
    
    /**
     * Constructor other - Builds the ball object to start at a random rotation
     */
    public Participant (int direction)
    {
        speed = Greenfoot.getRandomNumber (5) + 1;
        setRotation(direction);
        imgNumber = minNumber;
    }

    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void race()
    {
        moveUnits();
        turnDegrees();
    }

    /**
     * canSee - when it touches an object at its center, then it is "true"
     */
    public boolean canSee(Class otherClass)
    {
        Actor actor = getOneObjectAtOffset(0,0,otherClass);
        if (actor != null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * turnDegrees - The Participant will turn -10 to 10 degrees 20% inclusivity
     */
    public void turnDegrees()
    {
        if (Greenfoot.getRandomNumber(100) < 20)
        {
            int randomAngle = Greenfoot.getRandomNumber(21) - 10;
            turn(randomAngle);
        }
    }

    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void moveUnits()
    {
        move (Greenfoot.getRandomNumber(3) + 1);
    }

    /**
     * topSide - When the Participant reaches the top half and meets an obstacle, it should move backwards by 5 and turn 10 degrees clockwise
     */
    public void topSide()
    { 
        move (-5);
        turn (10);
    }

    /**
     * bottomSide - When the Participant reaches the bottom half and meets an obstacle, it should move backwards by 5 and turn 10 degrees counterclockwise
     */
    public void bottomSide()
    {
        move(-5);
        turn(-10);
    }
}
