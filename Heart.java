import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class Heart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Heart extends Actor
{
    /**
     * Act - do whatever the Heart wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    int w = 10;
    int h = 10;
    public int lives;
    
    public Heart() 
    {
        lives = 5;
    }

    public void act()
    {
        show();
    }

    public void decreaseLives() {
        lives--;   
    }
    
    public boolean isEmpty() {
        return lives <= 0;
    }

    public void show() {
        GreenfootImage bg = new GreenfootImage(getWorld().getWidth(), 20);

        for(int i = 0 ; i < lives; i++) {
            int size = 15;
            int gap = 10;
            bg.setColor(new Color(255, 239, 232));
            bg.fillRect(i * (size+gap) + gap, 0, size, size);
            
            //System.out.println(i * (size+10));
            
        }
        setImage(bg);
    }
}
