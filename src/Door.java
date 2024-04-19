import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Door extends Actor
{
    GreenfootImage img = new GreenfootImage(40, 60);
    public boolean open = false;

    public Door() {
        img.setColor(Color.BLACK);
        img.fillRect(0, 0, 40, 80);
        setImage(img);
    }

    public void act()
    {
        if(!open) {
            img.setColor(Color.BLACK);
        } else {
            img.setColor(Color.WHITE);
        }
        
        img.fillRect(0, 0, 40, 80);

        if(isTouching(Player.class) && open) {
            int level = ((Levels) getWorld()).level;

            switch(level) {
                case 1:
                    Greenfoot.setWorld(new Level2());
                    break;
                case 2:
                    Greenfoot.setWorld(new Level3());
                    break;
                case 3:
                    Greenfoot.setWorld(new Level4());
                    break;
                case 4:
                    Greenfoot.setWorld(new Level5());
                    break;
                case 5:
                    Greenfoot.setWorld(new Level6());
                    break;
                case 6:
                    Main.bgMusic.stop();
                    Greenfoot.setWorld(new EndingScene());
                    break;
            }

        }
    }
}
