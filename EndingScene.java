import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndingScene here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EndingScene extends World
{

    /**
     * Constructor for objects of class EndingScene.
     * 
     */
    int frame = 0;
    int timeInterval = 2;
    int timer = 0;
    
    String baseName = "ending/ending";
    String ext = ".jpg";
    
    GreenfootSound endingSound = new GreenfootSound("ending.mp3");
    
    public EndingScene()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 720, 1);
        setBackground(baseName + frame + ext);
    }
    
    public void act()
    {
        if (timer < timeInterval) {
            timer++;
        } else {
            frame++;
            if (frame > 449) {
                frame = 0;
                endingSound.stop();
                Greenfoot.setWorld(new Main());
            }
            if (frame >= 60) {
                if (!endingSound.isPlaying()) endingSound.playLoop();
                setBackground(baseName + frame + ext);
            }
            timer = 0;
        }
    }
}
