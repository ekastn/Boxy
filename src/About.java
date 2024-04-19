import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class About extends Actor {
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new AboutScene());
        }
    }
}
