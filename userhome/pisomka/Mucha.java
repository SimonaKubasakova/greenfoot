import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mucha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mucha extends Actor
{
    private String smer ="w, a, s ,d";
    private int rychlost;
    private int krok;
    public Mucha(String smer)
    {
        this.rychlost=1;
        this.smer = smer;
        this.krok= 0;
        if(this.smer == "w")
        
            turn(-90);
        
        else if(this.smer == "s")
        
            turn(90);
        
        else if (this.smer == "a")
            turn(180);
        
          else if (this.smer == "d")
            turn(0);
        
    } 
    public void act()
    {
        pohybujSa();
    }
    public void pohybujSa()
    {
          move(this.rychlost);
        this.krok++;
       
        if(this.krok == 50)
        {
            turn(180);
            this.krok=0;
    }
}
}
