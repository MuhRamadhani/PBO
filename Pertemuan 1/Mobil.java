import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mobil here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class Mobil extends Actor
{
    /**
     * Act - do whatever the Mobil wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed = 5;
    public void act()
    {
        World w = getWorld();
        move(speed);
        if(isAtEdge())
        {
            setRotation(getRotation()-90);
            turn(25);
        }
        if(isTouching(No.class)){
            setImage("skull.png");
            speed = 0;
        }
    }
}
