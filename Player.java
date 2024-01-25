import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    private float initPosX, initPosY;

    private float velX, velY;
    private float gravityX, gravityY;

    GreenfootImage img;

    float jumpscl = 6.5f;

    boolean jump = false;
    boolean flip = false;

    public Player()
    {
        img = new GreenfootImage(15, 15);
        img.setColor(new Color(255, 239, 232));
        img.fill();
        setImage(img);

        // Initialize gravity and velocity
        gravityX = 0;
        gravityY = 0.4f;
        velX = 0;
        velY = 0;
    }

    public void act()
    {
        onCeiling();
        applyGravity();
        flipGravity();
        jump();
        move();

        setLocation(getX() + (int)velX, getY() + (int)velY);
        velX = 0;
    }

    public void reset() {
        // Initialize gravity and velocity
        gravityX = 0;
        gravityY = 0.4f;
        velX = 0;
        velY = 0;
        setLocation((int)initPosX , (int)initPosY);
    }

    public void move() {
        int speed = 3;
        if (Greenfoot.isKeyDown("right")) {
            velX = speed;
        }
        if (Greenfoot.isKeyDown("left")) {
            velX = -speed;
        }
        onRightWall();
        onLeftWall();
    }

    public void jump() {
        if (Greenfoot.isKeyDown("space") && !jump) {
            GreenfootSound  sound = new GreenfootSound("jump.wav");
            sound.setVolume(60);
            sound.play();
            if (!isFliped()) {
                velY -= jumpscl;
            } else {
                velY += jumpscl;
            }
        }
    }

    public void applyGravity() {
        if (onGround()) {
            velY = 0;
        } else {
            applyForce(gravityX,gravityY);
            jump = true;
        }
    }

    public void applyForce(float forceX, float forceY) {
        velX += forceX;
        velY += forceY;
    }

    public void flipGravity() {
        if (onHorizon() && !flip) {
            //gravity.mult(-1);
            gravityX = - gravityX;
            gravityY = - gravityY;
            flip = true;
        } else if(!onHorizon()) {
            flip = false;
        }
    }

    public boolean isFliped() {
        //return gravity.heading() < 0;
        return gravityY < 0;
    }

    public boolean onHorizon() {
        return isTouching(Horizon.class);
    }

    public boolean onGround() {
        Actor p;
        if (!isFliped()) {
            p = getOneObjectAtOffset(0, getImage().getHeight()/2, Platform.class);
        } else {
            p = getOneObjectAtOffset(0, -getImage().getHeight()/2, Platform.class);
        }
        if(p == null) {
            return false;
        }
        touchGround(p);
        return true;
    }

    public boolean onCeiling() {
        Actor p;
        if (!isFliped()) {
            p = getOneObjectAtOffset(0, -getImage().getHeight()/2, Platform.class);
        } else {
            p = getOneObjectAtOffset(0, getImage().getHeight()/2, Platform.class);
        }
        if(p == null) {
            return false;
        }
        touchCeiling(p);
        return true;
    }

    public boolean onRightWall() {
        int w = getImage().getWidth();
        int d = (int)(w/2);
        Actor p = getOneObjectAtOffset(d, 0, Platform.class);
        if(p == null) {
            return false;
        }
        touchRightWall(p);
        return true;
    }

    public boolean onLeftWall() {
        int w = getImage().getWidth();
        int d = (int)(w/-2);
        Actor p = getOneObjectAtOffset(d, 0, Platform.class);
        if(p == null) {
            return false;
        }
        touchLeftWall(p);
        return true;
    }

    public void touchGround(Actor p) {
        int ph = p.getImage().getHeight();
        int s = (ph+getImage().getHeight())/2;
        int ny = p.getY();
        if (!isFliped()) {
            ny -= s;
        } else {
            ny += s;
        }
        setLocation(getX(), ny);
        jump = false;
    }

    public void touchCeiling(Actor p) {
        int ph = p.getImage().getHeight();
        int s = (ph+getImage().getHeight())/2;
        int ny = p.getY();
        if (!isFliped()) {
            ny += s;
        } else {
            ny -= s;
        }
        //vel.y = 0;
        setLocation(getX(), ny);
        jump = false;
    }

    public void touchRightWall(Actor p) {
        int pw = p.getImage().getWidth();
        int nx = p.getX() - (pw+getImage().getWidth())/2;
        setLocation(nx, getY());
    }

    public void touchLeftWall(Actor p) {
        int pw = p.getImage().getWidth();
        int nx = p.getX() + (pw+getImage().getWidth())/2;
        setLocation(nx, getY());
    }

    public boolean fall() {
        return getY() > getWorld().getHeight() + 40 || getY() < -40;
    }

    public boolean hitObsticle() {
        return isTouching(Obsticle.class);
    }

    public boolean hitKey() {
        return isTouching(Key.class);
    }

    public void setInitPos() {
        //initPos = new PVector(getX(), getY());
        initPosX = getX();
        initPosY = getY();
    }
}
