import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Vcela here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vcela extends Actor
{
    /**
     * Act - do whatever the Vcela wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        int x = getX();
        int y = getY();
        
        if(this.isAtEdge()){
            setLocation(x+20,y+3);
            turn(180);
        }
        else{
            setLocation(x+20,y-3);
            turn(-180);
        }
    }
}
