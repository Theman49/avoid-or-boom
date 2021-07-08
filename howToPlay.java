// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class howToPlay extends Actor
{

    /**
     * 
     */
    public howToPlay()
    {
        setImage("howToPlay.png");
    }

    /**
     * Act - do whatever the howToPlay wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseClicked(this)) {
            setImage("htpClicked.png");
            Greenfoot.delay(2);
            setImage("howToPlay.png");
            Greenfoot.delay(2);
            Greenfoot.setWorld( new help());
        }
    }
}
