import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends Levels
{

    /**
     * Constructor for objects of class Level2.
     * 
     */

    public Level2()
    {    
        super(400, 240, heart);
        level = 2;
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        placeBlock(380, 300, 4, 6);
        placeBlock(720, 380, 6, 1);
        placeHorizon(580, 380, 280);

        addObject(door,790,340);


        addObject(key, 790, 420);

    }

}
