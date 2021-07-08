// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class car01 extends Actor
{
    public int speed = ((MyWorld)getWorld()).speed;
    public int cek = 0;

    /**
     * 
     */
    public car01()
    {
        setImage("car01-n.png");
    }

    /**
     * Act - do whatever the garisJalan wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(1);
        touch();
    }

    /**
     * 
     */
    public void move(int n)
    {
        int random = Greenfoot.getRandomNumber(100);
        if (((MyWorld)getWorld()).score > 100) {
            n = 2;
        }
        if (Greenfoot.mouseDragged(this)) {
            int x = Greenfoot.getMouseInfo().getX();
            int y = Greenfoot.getMouseInfo().getY();
            if (y > 165 - 3 && y < 270 - 30) {
                setLocation(getX(), y);
            }
        }
        if (random * 30 == ((MyWorld)getWorld()).score) {
            bonus();
        }
    }

    /**
     * 
     */
    public void bonus()
    {
        if (cek == 0) {
            int random = Greenfoot.getRandomNumber(2);
            int random2 = Greenfoot.getRandomNumber(5);
            int a = 0;
            if (random2 == 3) {
                if (random == 0) {
                    a = 188;
                }
                else if (random == 1) {
                    a = 223;
                }
                bonus ban =  new bonus();
                getWorld().addObject(ban, 400, a);
                cek = 1;
            }
        }
    }

    /**
     * 
     */
    public void touch()
    {
        if (cek == 1) {
            bonus ban = getWorld().getObjects(bonus.class).get(0);
            ban.setLocation(ban.getX() - speed, ban.getY());
            if (isTouching(bonus.class)) {
                getWorld().removeObject(ban);
                cek = 0;
                ((MyWorld)getWorld()).tires = ((MyWorld)getWorld()).tires + 1;
            }
            else {
                if (ban.getX() == 0) {
                    getWorld().removeObject(ban);
                    cek = 0;
                }
            }
        }
    }
}
