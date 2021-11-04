import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Skala here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mucha extends Actor //definicia triedy
{
    private int smer; //atribut
    int pocitadlo= 0;   
    
     public Mucha(int smer)
    {
        this.smer= smer;
        this.pocitadlo=0;
        if(this.smer<0)
            turn(180);
    } 
    /**
     * Act - do whatever the Skala wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()  //skala beha dolava a doprava aleb hore a dole
    {
        if(pocitadlo <200) //chceme aby sa skala pohybovala o 20 pixelov
        {
           //turn(45);
            move(this.smer);
           //turn(-45);
           this.pocitadlo++;
        }
        else
            {
                
                this.pocitadlo=0;
                turn(180);
            }
        
    }
}
