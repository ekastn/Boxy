import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Level6 extends Levels {
    public Level6() {
        super(340, 300, heart);
        level = 6;
        prepare();
    }

    public void prepare() {
        int x1 = 280;
        placeBlock(x1, 360, 4, 10);
        int x2 = x1 + scl * 4;
        placeBlock(x2, 360, 3, 7);
        placeBlock(x2 + scl * 6, 360, 2, 3);

        byte[][] ground = {
                { 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1 },
                { 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1 },
                { 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1 },
                { 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1 },
                { 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1 },
                { 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1 },
        };
        placeBlock(ground, x2 + scl * 14, 360);
        placeBlock(570, 500, 2, 1);
        placeBlock(600, 460, 2, 1);

        placeBlock(550, 200, 4, 1);
        addObject(door, 580, 160);
        addObject(key, 580, 540);

        int hy = 380;
        placeHorizon(x2 + scl * 4, hy, 80);
        placeHorizon(x2 + scl * 10 + 10, hy, 140);
        placeHorizon(x2 + scl * 20, hy, 80);
    }
}
