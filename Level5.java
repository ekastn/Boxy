import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level5 extends Levels
{

    /**
     * Constructor for objects of class Level5.
     * 
     */

    public Level5()
    {
        super(470, 320, heart);
        level = 5;
        prepare();
    }

    public void prepare()
    {
        int x = 290;
        int y = 180;
        
        byte[][] map = {
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1},
                {1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1},
                {1, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1}
            };
        placeBlock(map, 110+x, 130+y);
        placeHorizon(240+x, 190+y, 60);
        placeHorizon(320+x, 190+y, 60);
        placeObsticle(270+x, 170+y, 2, 1);
        placeObsticle(270+x, 230+y, 2, 1, 180);

        addObject(door, 460+x, 90+y);

        addObject(key, 160+x, 310+y);
    }

}
