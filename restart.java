// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class restart extends start
{

    /**
     * 
     */
    public restart()
    {
        setImage("restart.png");
    }

    /**
     * Act - do whatever the restart wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
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
            setImage("restart2.png");
            Greenfoot.delay(2);
            setImage("restart.png");
            Greenfoot.delay(2);
            Greenfoot.setWorld( new  MyWorld());
        }
    }
}
