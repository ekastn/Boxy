import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level6 extends Levels
{

    /**
     * Constructor for objects of class Level6.
     * 
     */
    public Level6()
    {
        super(340, 300, heart);
        level = 6;
        prepare();
    }

    public void prepare()
    {  
        int x1 = 280;
        placeBlock(x1, 360, 4, 10);
        int x2 = x1 + scl * 4;
        placeBlock(x2, 360, 3, 7);
        placeBlock(x2 + scl * 6, 360, 2, 3);

        byte[][] ground = {
                {1,1,1,1,1,0,0,0,1,1,1,1,1},
                {1,1,1,1,1,0,0,0,1,1,1,1,1},
                {1,1,1,1,0,0,0,0,0,1,1,1,1},
                {1,1,1,0,0,0,0,0,0,0,1,1,1},
                {1,1,0,0,0,0,0,0,0,0,0,1,1},
                {1,1,0,0,0,0,0,0,0,0,0,1,1},
                {1,1,0,0,0,0,0,0,0,0,0,1,1},
                {1,1,0,0,0,0,0,0,0,0,0,1,1},
            };
        placeBlock(ground, x2 + scl * 14, 360);
        placeBlock(570, 500, 2, 1);
        placeBlock(600, 460, 2, 1);
        
        placeBlock(550, 200, 4, 1);
        addObject(door, 580, 160);
        addObject(key, 580, 540);
        //placeObsticle(x2 + scl * 14, 440, 1, 4, 90);
        
        int hy = 380;
        placeHorizon(x2 + scl * 4, hy, 80);
        placeHorizon(x2 + scl * 10+10, hy, 140);
        placeHorizon(x2 + scl * 20, hy, 80);
    }
}
