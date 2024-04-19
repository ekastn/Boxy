import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Level2 extends Levels {
    public Level2() {
        super(400, 240, heart);
        level = 2;
        prepare();
    }

    private void prepare() {
        placeBlock(380, 300, 4, 6);
        placeBlock(720, 380, 6, 1);
        placeHorizon(580, 380, 280);

        addObject(door, 790, 340);

        addObject(key, 790, 420);

    }

}
