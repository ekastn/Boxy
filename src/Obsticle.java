import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Obsticle extends Actor {
    int w = 20;
    int h = 20;

    public Obsticle() {
        GreenfootImage img = new GreenfootImage(w, h);
        img.setColor(Color.ORANGE);
        img.fillPolygon(new int[] { 0, w / 2, w }, new int[] { h, 0, h }, 3);

        setImage(img);
    }
}
