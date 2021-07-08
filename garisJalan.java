// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class garisJalan extends Actor
{
    public int speed = ((MyWorld)getWorld()).speed;

    /**
     * 
     */
    public garisJalan()
    {
        setImage("garis.png");
    }

    /**
     * Act - do whatever the garisJalan wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(speed);
    }

    /**
     * 
     */
    public void move(int speed)
    {
        int tires = ((MyWorld)getWorld()).tires;
        if (tires >= 0) {
            setLocation(getX() - speed, getY());
            looping();
        }
    }

    /**
     * 
     */
    public void looping()
    {
        if (getX() == 0) {
            setLocation(getX() + 400, getY());
        }
        else if (getX() == 400 - 1) {
            setLocation(getX() - 400, getY());
        }
    }
}
