import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Platform extends Actor {
    int w = 20;
    int h = 20;

    public Platform() {
        GreenfootImage img = new GreenfootImage(w, h);
        int c = 230;
        img.setColor(new Color(c, c, 240));
        img.fillRect(0, 0, w, h);
        int c2 = c - 70;
        img.setColor(new Color(c2, c2, c2));
        img.drawRect(0, 0, w, h);
        setImage(img);
    }
}
