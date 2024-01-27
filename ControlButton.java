import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ControlButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ControlButton extends Actor
{
    /**
     * Act - do whatever the ControlButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ControlButton(String dir)
    {
        setImage("Control" + dir + ".png");
    }
}
