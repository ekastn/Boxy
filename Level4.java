import greenfoot.*;
import java.util.*;

/**
 * Write a description of class Level4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level4 extends Levels
{

    /**
     * Constructor for objects of class Level4.
     * 
     */

    public Level4()
    {    
        super(500, 300, heart);
        level = 4;
        prepare();
    }

    private void prepare()
    {
        int x = 290;
        int y = 180;
        placeBlock(180+x, 120+y, 1, 2);
        placeBlock(180+x, 160+y, 5, 2);
        placeBlock(320+x, 160+y, 6, 5);

        byte[][] map = {
                {0, 1, 1},
                {1, 1, 1}
            };
        placeBlock(map, 380+x, 120+y);

        placeObsticle(240+x, 200+y, 2, 1, 180);
        placeHorizon(290+x, 160+y, 60);

        addObject(door,390+x,280+y);

        addObject(key, 190+x, 220+y);

    }

}
