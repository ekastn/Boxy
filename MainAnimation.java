import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainAnimation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainAnimation extends Actor
{
    /**
     * Act - do whatever the MainAnimation wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */ 
    int count = 0;
    int imginc = 0;
    GreenfootImage[] imgs = new GreenfootImage[29];
    public MainAnimation() 
    {
        //setImage("base"+imginc+".png");
        for (int i = 0; i < imgs.length; i++) {
            imgs[i] = new GreenfootImage("base"+i+".png");
        }
        setImage(imgs[0]);
    }
    
    public void act()
    {
        if (count % 3 == 0) {
            imginc = (imginc + 1) % 29;
        }
        setImage(imgs[imginc]);
        count++;
    }
}
