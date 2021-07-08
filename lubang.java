// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class lubang extends garisJalan
{

    /**
     * 
     */
    public lubang()
    {
        setImage("lubang.png");
    }

    /**
     * Act - do whatever the lubang wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(speed);
        touch();
    }

    /**
     * 
     */
    public void looping()
    {
        int random = Greenfoot.getRandomNumber(2);
        int a = 0;
        int score = ((MyWorld)getWorld()).score;
        if (getX() == 0) {
            if (random == 0) {
                a = 188;
            }
            else if (random == 1) {
                a = 245;
            }
            setLocation(400, a);
            ((MyWorld)getWorld()).score = score + 10;
        }
        else if (getX() == 400 - 1) {
            setLocation(getX() - 400, getY());
        }
    }

    /**
     * 
     */
    public void touch()
    {
        if (isTouching(roda.class)) {
            boom boom =  new boom();
            int tires = ((MyWorld)getWorld()).tires;
            if (((MyWorld)getWorld()).tires == 0) {
                getWorld().addObject(boom, getX() - 50, getY());
                Greenfoot.setSpeed(50);
                Greenfoot.setWorld( new gameOver());
            }
            else {
                getWorld().addObject(boom, getX() - 50, getY());
                Greenfoot.delay(5);
                int y = getY();
                if (y == 188) {
                    y = 245;
                }
                else if (y == 245) {
                    y = 188;
                }
                getWorld().removeObject(boom);
                setLocation(400, y);
                ((MyWorld)getWorld()).tires = tires - 1;
            }
        }
    }
}
