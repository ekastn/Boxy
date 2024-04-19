import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * EndingScene class is the last scene of the game.
 * It shows the ending animation and goes back to the main menu
 * after the animation finishes playing.
 */
public class EndingScene extends World {
    // initial animation frame
    int frame = 0;
    // time interval between changing frames
    int timeInterval = 2;
    // timer to keep track of time between frames
    int timer = 0;

    // settting up the base name and extension for the main animation sequence
    String baseName = "ending/ending";
    String ext = ".jpg";

    GreenfootSound endingSound = new GreenfootSound("ending.mp3");

    public EndingScene() {
        super(1200, 720, 1);
        setBackground(baseName + frame + ext);
    }

    public void act() {
        timer++;
        if (timer >= timeInterval) {
            frame++;
            if (frame > 449) {
                frame = 0;
                endingSound.stop();
                Greenfoot.setWorld(new Main());
            }
            if (frame >= 60) {
                if (!endingSound.isPlaying()) {
                    endingSound.playLoop();
                }
                setBackground(baseName + frame + ext);
            }
            timer = 0;
        }
    }
}
