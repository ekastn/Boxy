import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Horizon extends Actor {
    public Horizon(int w) {
        int h = 5;
        GreenfootImage img = new GreenfootImage(w, h);
        img.setColor(Color.RED);
        img.fillRect(0, 0, w, h);
        setImage(img);
    }
}
