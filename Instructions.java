import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Instructions puts out on the screen instructions to say Game Over.
 * 
 * @author : Claire Li
 * @date : 05/03/2024
 */
public class Instructions extends Actor
{
    /**
     * Instructions - Constructor to build the instructions object
     * Notice - It does not have a return typelike other methods
     * This will be enacted one time when each new object of the class is
     * built.
     */
    public Instructions()  
    {

    } 

    /**
     * Instructions(int Numbers) - Constructor to detect the "Numbers" from other classes,
     * to organize the texts when the game ends.
     */
    public Instructions(int Numbers)
    {
        if (Numbers == 1)
        {
            String instructions = "Game over, the Bear won!";
            GreenfootImage Instructions = new GreenfootImage(instructions, 24, Color.ORANGE, Color.WHITE);
            setImage(Instructions);
        }
        if (Numbers == 2)
        {
            String instructions = "Game over, the Seal won!";
            GreenfootImage Instructions = new GreenfootImage(instructions, 24, Color.GRAY, Color.WHITE);
            setImage(Instructions);
        }
        if (Numbers == 3)
        {
            String instructions = "Game over, the Sheep won!";
            GreenfootImage Instructions = new GreenfootImage(instructions, 24, Color.BLACK, Color.WHITE);
            setImage(Instructions);
        }
        if (Numbers == 4)
        {
            String instructions = "Game over, the Turtle won!";
            GreenfootImage Instructions = new GreenfootImage(instructions, 24, Color.GREEN, Color.WHITE);
            setImage(Instructions);        
        }
    }
}

