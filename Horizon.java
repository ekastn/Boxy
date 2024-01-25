import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Horizon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Horizon extends Actor
{
    /**
     * Act - do whatever the Horizon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Horizon(int w) {
        int h = 5;
        GreenfootImage img = new GreenfootImage(w, h);
        img.setColor(Color.RED);
        img.fillRect(0, 0, w, h);
        setImage(img);
    }
    
    public void act()
    {
        // Add your action code here.
    }
}
