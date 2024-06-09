import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Red is a Projectile class that acts similarly to a bullet, where the Participants touch
 * and then is resetted it to its original position and location;
 * When clicked, the red projectile moves.
 * 
 * @author Claire Li 
 * @version 05/03/2024
 */
public class Red extends Projectile
{
    public boolean click = false;
    /**
     * Constructor default - Builds the ball object to start at a random rotation
     */
    public Red()
    {
        getImage().setTransparency(Greenfoot.getRandomNumber(255)+1);
        setRotation(135);
    }

    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        mouseClick();
        if (click)
        {
            move (5);
            changeTransparency();
        }
    }

    /**
     * mouseClick - when mouse is clicked, it is detected and shown as "true"
     */
    public void mouseClick()
    {
        if (Greenfoot.mouseClicked(null))
        {
            click = true;
        }
    }

    /**
     * changeTransparency - change the transparency and continually make it
     * more opaque until it disappears
     */
    public void changeTransparency()
    {
        GreenfootImage img = getImage();
        int alpha = img.getTransparency();
        if (alpha > 0)
        {   
            img.setTransparency(alpha - 1);
        }
        else
        {
            if (this != null)
            {
                getWorld().addObject(new Red(), 660,15);
            }
            getWorld().removeObject(this);
        }
    }

}
