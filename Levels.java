import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Levels here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Levels extends World
{

    /**
     * Constructor for objects of class Levels.
     * 
     */
    public int scl = 20;
    public int level = 0;
    int initLive = 5;
    
    public Player player = new Player();
    public Door door = new Door();
    public Key key = new Key();
    static Heart heart;
    
    public Levels(int px, int py, Heart h)
    {    
        super(1200, 720, 1, false);
        
        //Color c = new Color(198, 151, 116);
        Color c = new Color(110, 133, 178);
        getBackground().setColor(c);
        getBackground().fill();

        setPaintOrder(Player.class);
        
        addObject(player, px, py);
        player.setInitPos();
        
        if (h == null) {
            heart = new Heart();
        } else {
            heart = h;
        }
        addObject(heart, getWidth()/2, 20);
    }

    public void act() 
    {
        if(player.fall() || player.hitObsticle()) {
            player.reset();
            key.show = true;
            door.open = false;
            if(heart.isEmpty()) {
                gaveOver();
            }
            heart.decreaseLives();
        }
        if (player.hitKey()) {
            key.show = false;
            door.open = true;
        }
    }
    
    public void placeBlock(int sx, int sy, int lenx, int leny) {
        for(int x = 0; x < lenx; x++) {
            for(int y = 0; y < leny; y++) {
                addObject(new Platform(), sx+x*scl, sy+y*scl);
            }
        }
    }
    
    public void placeBlock(byte[][] arr2D, int sx, int sy) {
        for(int y = 0, n = arr2D.length; y < n; y++) {
            for(int x = 0, nn = arr2D[y].length; x < nn; x++) {
                if (arr2D[y][x] == 1) {
                    addObject(new Platform(), sx+x*scl, sy+y*scl);
                }
            }
        }
    }

    public void placeObsticle(int sx, int sy, int lenx, int leny) {
        for(int x = 0; x < lenx; x++) {
            for(int y = 0; y < leny; y++) {
                addObject(new Obsticle(), sx+x*scl, sy+y*scl);
            }
        }
    }
    
    public void placeObsticle(int sx, int sy, int lenx, int leny, int angle) {
        for(int x = 0; x < lenx; x++) {
            for(int y = 0; y < leny; y++) {
                Obsticle obtcl = new Obsticle();
                addObject(obtcl, sx+x*scl, sy+y*scl);
                obtcl.turn(angle);
            }
        }
    }
    
    public void placeHorizon(int x, int y, int w) {
        addObject(new Horizon(w), x, y);
    }
    
    public void gaveOver() {
        Greenfoot.setWorld(new Main());
    }
}
