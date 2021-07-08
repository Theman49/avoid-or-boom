// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class home extends World
{

    /**
     * Constructor for objects of class home.
     */
    public home()
    {
        super(400, 300, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        setBackground("background2.png");
        start start =  new start();
        addObject(start, 191, 189);
        howToPlay howToPlay =  new howToPlay();
        addObject(howToPlay, 193, 223);
        title title =  new title();
        addObject(title, 198, 74);
    }
}
