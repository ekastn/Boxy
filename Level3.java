import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends Levels
{

    /**
     * Constructor for objects of class Level3.
     * 
     */

    public Level3()
    {    
        super(420, 320, heart);
        level = 3;
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        byte[][] ground = {
            {1,1,1,0,0,0,1,1,0,0,1,1,1,0,0,1,1,1,1,1},
            {1,1,1,0,0,0,1,1,0,0,1,1,1,0,0,1,1,1,1,1},
            {1,1,1,0,0,0,1,1,0,0,1,1,1,0,0,0,0,0,0,0},
        };
        placeBlock(ground, 400, 360);
        
        placeObsticle(600, 340, 3, 1);
        placeHorizon(570, 380, 60);
        placeHorizon(670, 380, 60);

        addObject(door,750,320);
        

        addObject(key, 420, 440);
    }

}
