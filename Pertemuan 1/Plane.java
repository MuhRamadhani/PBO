import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Plane here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Plane extends Actor
{
    /**
     * Act - do whatever the Plane wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    World w;
    public void act()
    {
        w = getWorld();
        shooter();
        if(Greenfoot.isKeyDown("w")){
            setRotation(-90);
            move(4);
        }
        if(Greenfoot.isKeyDown("s")){
            setRotation(90);
            move(4);
        }
        if(Greenfoot.isKeyDown("d")){
            setRotation(0);
            move(4);
        }
        if(Greenfoot.isKeyDown("a")){
            setRotation(180);
            move(4);
        }
        
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY()-10);
        }
        if(Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY()+10);
        }
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX()-10, getY());
        }
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+10, getY());
        }
        if(isTouching(No.class)){
            setImage("skull.png");
        }
        if(isAtEdge())
        {
            w.removeObject(this);
        }
    }
    
    public void shooter()
    {
        World w = getWorld();
        if(Greenfoot.isKeyDown("space"))
        {
            w.addObject(new Shot(),getX(), getY());
        }
    }
    
    public Plane()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/2;
        int myNewWidth = (int)myImage.getWidth()/2;
        myImage.scale(myNewWidth, myNewHeight);
    }
}
