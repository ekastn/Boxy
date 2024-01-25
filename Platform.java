import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Platform here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Platform extends Actor
{
    /**
     * Act - do whatever the Platform wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int w = 20;
    int h = 20;
    public Platform()
    {
        GreenfootImage img = new GreenfootImage(w, h);
        int c = 230;
        img.setColor(new Color(c, c, 240));
        img.fillRect(0, 0, w, h);
        int c2 = c-70;
        img.setColor(new Color(c2, c2, c2));
        img.drawRect(0, 0, w, h);
        setImage(img);
    }
    public void act()
    {
        // Add your action code here.
    }
}
