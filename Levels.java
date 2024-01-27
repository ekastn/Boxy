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

    int endTimer = 0;
    int endTimerLimit = 200;
    boolean isGameOver = false;

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

        showControl();

        //addObject(new Fps(), 150, 50);
    }

    public void act() 
    {
        if (heart.isEmpty()) {
            gameOver();
        }
        if ((player.fall() || player.hitObsticle()) && !isGameOver) {
            player.reset();
            key.show = true;
            door.open = false;
            heart.decreaseLives();
        }
        if (player.hitKey()) {
            key.show = false;
            door.open = true;
        }
        if (isGameOver) {
            endTimer++;
        }
    }

    public void showControl() {
        int x = 90;
        int y = getHeight() - 90;
        addObject(new ControlButton("Left"), x, y);
        addObject(new ControlButton("Right"), x + 140, y);
        addObject(new ControlButton("Up"), getWidth() - x, y);
    }

    public void gameOver() {
        if (!isGameOver) {
            addObject(new GameOverText(), getWidth()/2, 100);
            isGameOver = true;
        }
        if (endTimer > endTimerLimit) {
            Main.bgMusic.stop();
            Greenfoot.setWorld(new Main());
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

}
