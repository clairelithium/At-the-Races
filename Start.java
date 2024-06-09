import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Start is the World where the game begins in, where it features the beginning before the actual game.
 * 
 * @author Claire Li 
 * @version 05/03/2024
 */
public class Start extends World
{
    /**
     * Constructor for objects of class Start.
     * 
     */
    public Start()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        prepare();

    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Button button = new Button();
        addObject(button,400,500);
    }

}
