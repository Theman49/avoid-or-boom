// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class tangan extends Actor
{
    public int n = 251;
    public int a = 0;

    /**
     * 
     */
    public tangan()
    {
        setImage("tangan.png");
    }

    /**
     * Act - do whatever the tangan wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
    }

    /**
     * 
     */
    public void move()
    {
        if (a == 0) {
            setLocation(getX(), getY() - 1);
            n = n - 1;
            if (n == 200) {
                a = 1;
            }
        }
        if (a == 1) {
            setLocation(getX(), getY() + 1);
            n = n + 1;
            if (n == 260) {
                a = 0;
            }
        }
    }
}
