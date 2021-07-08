// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class start extends Actor
{

    /**
     * 
     */
    public start()
    {
        setImage("start.png");
    }

    /**
     * Act - do whatever the start wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        click();
    }

    /**
     * 
     */
    public void click()
    {
        if (Greenfoot.mouseClicked(this)) {
            setImage("startClicked.png");
            Greenfoot.delay(2);
            setImage("start.png");
            Greenfoot.delay(2);
            Greenfoot.setWorld( new  MyWorld());
        }
    }
}
