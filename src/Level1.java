import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Level1 extends Levels {
    public Level1() {
        super(350, 340, new Heart());
        level = 1;
        prepare();
    }

    private void prepare() {
        byte[][] ground = {
                { 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1 }
        };
        placeBlock(ground, 330, 400);
        addObject(door, 780, 360);
        addObject(key, 620, 360);
    }
}
