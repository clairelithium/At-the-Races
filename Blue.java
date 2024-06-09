import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Blue is a Projectile class that acts similarly to a bullet, where the Participants touch
 * and then is resetted it to its original position and location.
 * Automatically, the blue projectile moves on default continuously.
 * 
 * @author Claire Li 
 * @version 05/03/2024
 */
public class Blue extends Projectile
{
    /**
     * Constructor default - Builds the ball object to start at a random rotation
     */
    public Blue()
    {
        getImage().setTransparency(Greenfoot.getRandomNumber(255)+1);
        setRotation(225);
    }

    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(5);
        changeTransparency();
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
                getWorld().addObject(new Blue(), 600,580);
            }
            getWorld().removeObject(this);
        }
    }

}
