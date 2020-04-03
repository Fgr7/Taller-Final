import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class JUGAR here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JUGAR extends Actor
{   
    MedicTerran mt = new MedicTerran();
    
    
    /**
     * Act - do whatever the JUGAR wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void click(){
    
        if( Greenfoot.mouseClicked(this))
        {
         Greenfoot.setWorld( new Mapa() );
         
        }
    }
    public void act() 
    {
        click();
    }    
}
