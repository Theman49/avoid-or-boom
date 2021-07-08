// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class back extends Actor
{

    /**
     * 
     */
    public back()
    {
        setImage("back.png");
    }

    /**
     * Act - do whatever the back wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
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
            setImage("backClicked.png");
            Greenfoot.delay(2);
            setImage("back.png");
            Greenfoot.delay(2);
            Greenfoot.setWorld( new home());
        }
    }
}
