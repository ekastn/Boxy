import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Key extends Actor
{
    int w = 15;
    int h = 15;
    
    GreenfootImage img = new GreenfootImage(w, h);
    boolean show = true;
    
    public Key() {
        img.setColor(Color.BLACK);
        img.fillRect(0, 0, w, h);
        img.setColor(Color.WHITE);
        img.drawRect(w/2/2, h/2/2, w/2, h/2);
        
        setImage(img);
    }

    public void act() {
        turn(2);
        
        if (show) {
            img.setTransparency(255);
        } else {
            img.setTransparency(0);
        }
    }
}
