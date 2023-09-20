import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bg extends World
{
    /**
     * Constructor for objects of class Bg.
     * 
     */
    public Bg()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 400, 1);
        addObject(new Plane(), 30, 200);
        addObject(new Mobil(), 100,100);
        prepare();
    }

    public void act()
    {
        if(Greenfoot.getRandomNumber(400) < 5)
        {
            addObject(new No(), Greenfoot.getRandomNumber(800),350);
        }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Mobil mobil = new Mobil();
        addObject(mobil,288,221);
        mobil.setRotation(80);
        Mobil mobil2 = new Mobil();
        addObject(mobil2,275,346);
        mobil2.setRotation(-25);
    }
}
