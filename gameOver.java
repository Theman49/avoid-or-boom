// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class gameOver extends World
{
    public int score = MyWorld.score;

    /**
     * Constructor for objects of class gameOver.
     */
    public gameOver()
    {
        super(400, 300, 1);
        setBackground("gameOver.png");
        showText("Your Score : " + score, 270, 100);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        backHome backHome =  new backHome();
        addObject(backHome, 333, 231);
        restart restart =  new restart();
        addObject(restart, 333, 189);
    }
}
