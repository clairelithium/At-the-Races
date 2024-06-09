import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * myWorld is the world after the start button is clicked and the game starts.
 * 
 * @author Claire Li 
 * @version 05/03/2024
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(800, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        int treeMax = 24;
        int treex = 25;

        for (int i = 0; i <= treeMax; i++)
        {
            addObject(new Tree(), treex+i*30,50);
            addObject(new Tree(), treex+i*30,540);
        }
        for (int i = 0; i <= 1; i++)
        {
            addObject(new Barrel(), Greenfoot.getRandomNumber(400) + 150,Greenfoot.getRandomNumber(350) + 150);
            addObject(new House(),Greenfoot.getRandomNumber(400) + 150,Greenfoot.getRandomNumber(350) + 150);
        }
        Finish finish = new Finish();
        addObject(finish,730,300);

        Counter counter = new Counter();
        addObject(counter,750,15);
        Bear bear = new Bear();
        addObject(bear,50,100);
        Seal seal = new Seal();
        addObject(seal,50,200);
        Sheep sheep = new Sheep();
        addObject(sheep,50,340);
        Turtle turtle = new Turtle();
        addObject(turtle,50,470);

        Blue blue = new Blue();
        addObject(blue,660,580);
        Red red = new Red();
        addObject(red,660,15);
        
    }
}
