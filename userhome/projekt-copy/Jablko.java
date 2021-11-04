import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jablko here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jablko extends Actor //definicia triedy
{
    /**
     * Act - do whatever the Jablko wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int rychlost; //atribut
    private int body;
    
    public Jablko()  //konstruktor
    {
        rychlost=10;
        body=0;
        
    }
    
    public Jablko(int rychlost)
    {
        this.rychlost=rychlost;
        this.body=body;
        
    }
    
    public void act()
    {
     pohybDole();
    }
    
    public void pohybDole()
    {
        turn (90);  //metody
        move (2);
        turn(-90);
    }
}
