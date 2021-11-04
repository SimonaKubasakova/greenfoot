import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Skala here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Skala extends Actor //definicia triedy
{
    private int smer; //atribut
    int pocitadlo= 0;   
   /* public Skala() //konstruktor
    {
        this.smer=1;
        this.pocitadlo = 0;
    }
    */
     public Skala(int smer)
    {
        this.smer= smer;
    }
    /**
     * Act - do whatever the Skala wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()  //skala beha dolava a doprava aleb hore a dole
    {
        if(pocitadlo <20) //chceme aby sa skala pohybovala o 20 pixelov
        {
           turn(45);
            move(this.smer);
           turn(-45);
           this.pocitadlo++;
        }
        else
            {
                this.smer *= -1; 
                this.pocitadlo=0;
            }
        
    }
}
