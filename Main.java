import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main extends World
{

    /**
     * Constructor for objects of class Main.
     * 
     */

    public static GreenfootSound bgMusic = new GreenfootSound("bg.mp3");

    public Main()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 720, 1);
        Color c = new Color(110, 133, 178);
        getBackground().setColor(c);
        getBackground().fill();

        if (!bgMusic.isPlaying()){
            bgMusic.playLoop();
        }
        

        prepare();
    }

    public void act() 
    {
        if (Greenfoot.isKeyDown("space")) {
            Greenfoot.setWorld(new Level1());
        }
    }

    public void prepare()
    {
        int x = getWidth()/2;
        int y = getHeight()/2;
        addObject(new SubLogo(), x-20, y+10);

        About about = new About();
        addObject(about,430,560);
        Start start = new Start();
        addObject(start,747,560);
    }
}
