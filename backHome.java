// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class backHome extends back
{

    /**
     * 
     */
    public backHome()
    {
        setImage("home.png");
    }

    /**
     * Act - do whatever the backHome wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
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
            setImage("home2.png");
            Greenfoot.delay(2);
            setImage("home.png");
            Greenfoot.delay(2);
            Greenfoot.setWorld( new home());
        }
    }
}
