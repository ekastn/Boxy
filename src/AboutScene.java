import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class AboutScene extends World {
    public AboutScene() {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 720, 1);
        Color c = new Color(110, 133, 178);
        getBackground().setColor(c);
        getBackground().fill();
        addObject(new AboutText(), getWidth() / 2, 360);
        addObject(new MenuBotton(), getWidth() / 2, 620);
    }
}
