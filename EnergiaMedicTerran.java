import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnergiaMedicTerran here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnergiaMedicTerran extends Counter
{
    int vidaMT = 120;
    int daño = 30;
    /**
     * Act - do whatever the EnergiaMedicTerran wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        setImage( new GreenfootImage("Vida :" + vidaMT, 20,Color.GREEN, Color.BLACK));
    }  
    public int vidaMT(){
     
        vidaMT = vidaMT;
        return vidaMT;
    }
    
    
    public void removervidaMT(){
     
        vidaMT = vidaMT - 30;
        
    }
    public void curarMT(){
    
        vidaMT= vidaMT - 20;
        
    }
    
     
}
