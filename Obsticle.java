import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Obsticle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Obsticle extends Actor
{
    /**
     * Act - do whatever the Obsticle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int w = 20;
    int h = 20;
    public Obsticle()
    {
        GreenfootImage img = new GreenfootImage(w, h);
        //img.setColor(new Color(248, 223, 212));
        //img.fillRect(0, 0, w, h);
        img.setColor(Color.ORANGE);
        img.fillPolygon(new int[]{0, w/2, w}, new int[]{h, 0, h}, 3);
        
        
        setImage(img);
    }
    public void act()
    {
        // Add your action code here.
    }
}
