import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Key here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Key extends Actor
{
    /**
     * Act - do whatever the Key wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

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
        /*
        if(isTouching(Player.class)) {
            Door door = ((Levels)getWorld()).door;
            door.open = true;
            getWorld().removeObject(this);
        }*/
        
    }
}
