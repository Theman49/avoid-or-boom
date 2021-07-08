// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class help extends World
{

    /**
     * Constructor for objects of class help.
     */
    public help()
    {
        super(400, 300, 1);
        showText("Tires + 1", 333, 190);
        showText("Tires - 1", 333, 230);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        setBackground("background3.png");
        carTutor carTutor =  new carTutor();
        addObject(carTutor, 62, 215);
        tangan tangan =  new tangan();
        addObject(tangan, 81, 257);
        tangan.setRotation(-30);
        back back =  new back();
        addObject(back, 190, 280);
        back.setLocation(205, 275);
        back.setLocation(199, 271);
        tutorial tutorial =  new tutorial();
        addObject(tutorial, 194, 75);
    }
}
