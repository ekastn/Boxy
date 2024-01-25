import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends Levels
{

    /**
     * Constructor for objects of class Level1.
     * 
     */

    public Level1()
    {    
        super(350, 340, new Heart());
        level = 1;
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        byte[][] ground = {
                {1,1,1,1,1,1,0,0,0,1,1,0,0,0,1,1,0,0,0,1,1,1,1,1,1},
                {1,1,1,1,1,1,0,0,0,1,1,0,0,0,1,1,0,0,0,1,1,1,1,1,1}
            };
        placeBlock(ground, 330, 400);
        
        addObject(door,780,360);

        addObject(key, 620, 360);

    }
}
