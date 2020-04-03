 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MedicTerran here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class MedicTerran extends Terran
{
    /**
     * Act - do whatever the MedicTerran wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   
    
    public void act() 
    {
        //movimiento del personaje
        if(Greenfoot.isKeyDown("right")){
        if(getX()<900){
            setLocation(getX()+1,getY());
        }
        }
        if(Greenfoot.isKeyDown("left")){
        if(getX()<900){
            setLocation(getX()-1,getY());
        }
        }
        if(Greenfoot.isKeyDown("up")){
        if(getY()<1000){
            setLocation(getX(),getY()-1);
        }
        }
        if(Greenfoot.isKeyDown("down")){
            if(getY()<1000){
        setLocation(getX(),getY()+1);}
        }
        //encuentro con objeto
        if(isTouching(Arbol.class))
        {
           if(getX()<900){
            setLocation(getX(),getY());
        }
        if(Greenfoot.isKeyDown("left")){
        if(getX()<900){
            setLocation(getX()+1,getY());
            
        }
        }
        if(Greenfoot.isKeyDown("up")){
        if(getY()<1000){
            setLocation(getX(),getY()+1);
        }
        }
        if(Greenfoot.isKeyDown("down")){
            if(getY()<1000){
        setLocation(getX(),getY()-1);}
        }
    }
        //combate
        if(isTouching(MedicZerg.class)&& Greenfoot.getRandomNumber(100)==3)
        {
             World myWorld = getWorld();
             Mapa mapa = (Mapa)myWorld;
             EnergiaTerran energy = mapa.getEnergiaTerran(); 
             energy.removenergy();
             getWorld().removeObjects(getWorld().getObjects(MedicTerran.class));
            
        }
        }
}


    
    
    

