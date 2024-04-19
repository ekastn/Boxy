import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Level3 extends Levels {
    public Level3() {
        super(420, 320, heart);
        level = 3;
        prepare();
    }

    private void prepare() {
        byte[][] ground = {
                { 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0 },
        };
        placeBlock(ground, 400, 360);

        placeObsticle(600, 340, 3, 1);
        placeHorizon(570, 380, 60);
        placeHorizon(670, 380, 60);

        addObject(door, 750, 320);

        addObject(key, 420, 440);
    }

}
