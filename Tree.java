import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Tree is an actor in the Obstacles class, which acts as a barrier for the outer edge of the World. 
 * 
 * @author Claire Li 
 * @version 05/03/2024
 */
public class Tree extends Obstacles
{
    /**
     * Tree - Constructor that scales its width and height to double the number.
     */
    public Tree()
    {
        getImage().scale(getImage().getWidth()*2, getImage().getHeight()*2);
    }
    
    /**
     * Act - do whatever the Tree wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
