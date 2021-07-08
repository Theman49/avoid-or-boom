// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class awan extends garisJalan
{

    /**
     * 
     */
    public awan()
    {
        setImage("awan.png");
    }

    /**
     * Act - do whatever the awan wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     * 
     * y =54
     */
    public void act()
    {
        int score = ((MyWorld)getWorld()).score;
        int malam = ((MyWorld)getWorld()).malam;
        move(super.speed);
        changeToNight(malam);
        if (score > 100 && score <= 200) {
            Greenfoot.setSpeed(52);
            malam = 1;
        }
        else if (score > 200 && score <= 300) {
            Greenfoot.setSpeed(54);
            malam = 0;
        }
        else if (score > 300 && score <= 400) {
            Greenfoot.setSpeed(56);
            malam = 1;
        }
        else if (score > 400 && score <= 500) {
            Greenfoot.setSpeed(58);
            malam = 0;
        }
        else if (score > 500 && score <= 600) {
            Greenfoot.setSpeed(60);
            malam = 1;
        }
        if (score > 600 && score <= 700) {
            Greenfoot.setSpeed(62);
            malam = 0;
        }
        else if (score > 700 && score <= 800) {
            Greenfoot.setSpeed(64);
            malam = 1;
        }
        else if (score > 800 && score <= 900) {
            Greenfoot.setSpeed(66);
            malam = 0;
        }
        else if (score > 900 & score <= 1000) {
            Greenfoot.setSpeed(68);
            malam = 1;
        }
        else if (score > 1000) {
            Greenfoot.setSpeed(70);
            malam = 0;
        }
    }

    /**
     * 
     */
    public void changeToNight(int malam)
    {
        if (malam == 1) {
            setImage("stars.png");
            setLocation(getX(), 57);
        }
        else if (malam == 0) {
            setImage("awan.png");
            setLocation(getX(), 24);
        }
    }
}
