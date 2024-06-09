import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Button is an actor clicked to start the game. 
 * 
 * @author Claire Li 
 * @version 05/03/2024
 */
public class Button extends Actor
{
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.playSound("HornBlast.wav");
            MyWorld world = new MyWorld();
            Greenfoot.setWorld(world);
        }
    }    
}
