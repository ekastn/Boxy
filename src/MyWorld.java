import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World {
    Player player = new Player();

    public MyWorld() {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        getBackground().setColor(new Color(198, 151, 116));
        getBackground().fill();
    }
}
