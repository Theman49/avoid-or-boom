// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{
    public static int speed = 2;
    public static int score = 0;
    public static int tires = 3;
    public static int malam = 0;

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(400, 300, 1);
        setBackground("bg.jpg");
        GreenfootSound soundStart =  new GreenfootSound("driving.mp3");
        soundStart.setVolume(70);
        soundStart.playLoop();
        score = 0;
        tires = 3;
        showText(score + " m", 40, 20);
        showText("Tires : " + tires, 340, 20);
        Greenfoot.setSpeed(50);
        prepare();
        act();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        garisJalan garisJalan =  new garisJalan();
        addObject(garisJalan, 370, 221);
        garisJalan garisJalan2 =  new garisJalan();
        addObject(garisJalan2, 290, 221);
        garisJalan garisJalan3 =  new garisJalan();
        addObject(garisJalan3, 210, 221);
        garisJalan garisJalan4 =  new garisJalan();
        addObject(garisJalan4, 130, 221);
        garisJalan garisJalan5 =  new garisJalan();
        addObject(garisJalan5, 50, 221);
        batas batas =  new batas();
        addObject(batas, 27, 168);
        batas batas2 =  new batas();
        addObject(batas2, 79, 168);
        batas batas3 =  new batas();
        addObject(batas3, 131, 168);
        awan awan =  new awan();
        addObject(awan, 278, 24);
        batas batas4 =  new batas();
        addObject(batas4, 183, 168);
        batas batas5 =  new batas();
        addObject(batas5, 235, 168);
        batas batas6 =  new batas();
        addObject(batas6, 287, 168);
        batas batas7 =  new batas();
        addObject(batas7, 332, 168);
        batas batas8 =  new batas();
        addObject(batas8, 384, 168);
        batas2 batas22 =  new batas2();
        lubang lubang =  new lubang();
        car01 car01 =  new car01();
        addObject(lubang, 320, 245);
        addObject(car01, 91, 183);
        roda roda =  new roda();
        addObject(roda, 133, 196);
        roda roda2 =  new roda();
        addObject(roda2, 46, 195);
        car01.setLocation(75, 182);
        roda.setLocation(117, 195);
        roda2.setLocation(30, 195);
        addObject(batas22, 25, 261);
        batas2 batas23 =  new batas2();
        addObject(batas23, 75, 261);
        batas2 batas24 =  new batas2();
        addObject(batas24, 125, 261);
        batas2 batas25 =  new batas2();
        addObject(batas25, 175, 261);
        batas2 batas26 =  new batas2();
        addObject(batas26, 225, 261);
        batas2 batas27 =  new batas2();
        addObject(batas27, 275, 261);
        batas2 batas28 =  new batas2();
        addObject(batas28, 325, 261);
        batas2 batas29 =  new batas2();
        addObject(batas29, 375, 261);
    }

    /**
     * 
     */
    public void act()
    {
        showText(score + " m", 40, 20);
        showText("Tires : " + tires, 340, 20);
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
            setBackground("bgNight.jpg");
        }
        else {
            setBackground("bg.jpg");
        }
    }
}
