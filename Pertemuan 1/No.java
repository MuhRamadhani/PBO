import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class No here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class No extends Actor
{
    /**
     * Act - do whatever the No wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    World w;
    public void act()
    {
        World w = getWorld();
        setLocation(getX(), getY()-1);
        if(isTouching(Shot.class)){
            w.removeObject(this);
        }
        if(isAtEdge())
        {
            w.removeObject(this);
        }
        if (Greenfoot.mouseClicked(this)) 
        {
            w.removeObject(this);;
        }
    }
}
