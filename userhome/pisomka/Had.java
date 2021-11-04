import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Had here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Had extends Actor
{
    public int rychlost;
    public int smer;
    public int uhol;
    public Had(){ //toto je konstruktor
        if(smer==1){
            this.uhol=90;
        }
        else if (this.smer==0)
        {
        this.uhol = 0;
        }
         this.rychlost=5;
        this.smer=smer;
    }
    
   
    public void act()
    {
        turn(-this.uhol);
        move(this.rychlost);
        turn(this.uhol);
        if(this.isAtEdge()){
            //this.rychlost *= -1; //meni hodntu rychlost na zapornu alebo kladnu
            turn(180);
        }
    }
}
