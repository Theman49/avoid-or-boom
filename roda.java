// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class roda extends car01
{

    /**
     * 
     */
    public roda()
    {
        setImage("roda.png");
    }

    /**
     * Act - do whatever the roda wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        int tires = ((MyWorld)getWorld()).tires;
        if (tires >= 0) {
            setRotation(getRotation() + 5);
        }
        move(1);
    }

    /**
     * 
     */
    public void move(int n)
    {
        if (((MyWorld)getWorld()).score > 100) {
            n = 2;
        }
        car01 car = getWorld().getObjects(car01.class).get(0);
        if (Greenfoot.mouseDragged(car)) {
            int y = Greenfoot.getMouseInfo().getY() + 13;
            if (y > 165 + 10 && y < 270 - 16) {
                setLocation(getX(), y);
            }
        }
    }
}
