import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A simple counter with graphical representation as an actor on the screen
 * 
 * @author (Claire Li) 
 * @date 05/03/2024
 */
public class Counter extends Actor
{
    private int target = 0;
    private GreenfootImage background; 
    private static final Color TRANSPARENT = new Color (0,0,0,0);
    private int frame;

    /**
     * Counter Constructor - initialize beginning variables and the counter 
     * image to display zero     
     */
    public Counter()
    {
        target = 0;
        background = getImage();
        updateImage();
    }

    /**
     * Act - do whatever the Lettuce wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        frame++;
        if (frame % 60 == 0)
        {
            target++;
        }
        updateImage();
    }

    /**
     * updateImage - updates the image on the screen to show the current counter value
     */
    public void updateImage()
    {
        GreenfootImage image = new GreenfootImage(background);
        GreenfootImage text = new GreenfootImage ("" + target, 22,Color.BLACK,TRANSPARENT);
        image.drawImage(text,image.getWidth()/2, image.getHeight() - text.getHeight());
        setImage(image);
    }

    /**
     * Add - adds a new score value to the current counter value
     */
    public void add(int score)
    {
        target += score;
        updateImage();
    }

}

