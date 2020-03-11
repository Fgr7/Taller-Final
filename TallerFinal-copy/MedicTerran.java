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
        if(getX()<800){
            setLocation(getX()+1,getY());
        }
        }
        if(Greenfoot.isKeyDown("left")){
        if(getX()<800){
            setLocation(getX()-1,getY());
            
        }
        }
        if(Greenfoot.isKeyDown("up")){
        if(getY()<600){
            setLocation(getX(),getY()-1);
        }
        }
        if(Greenfoot.isKeyDown("down")){
            if(getY()<600){
        setLocation(getX(),getY()+1);}
        }
    
}
}

    
    
    

