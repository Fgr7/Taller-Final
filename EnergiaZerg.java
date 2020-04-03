import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnergiaZerg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnergiaZerg extends Counter
{
    int energia = 100;
    int menos = -20;
    
    /**
     * Act - do whatever the EnergiaZerg wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage( new GreenfootImage("Energy :" + energia, 24, Color.RED, Color.BLACK));
    }    
    public void removenergy(){
        
        energia = energia + menos;
    }
    
    public void addenergy(){
        
        energia++;
        
    }

}
