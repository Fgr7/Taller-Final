import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GuerreroTerran here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GuerreroTerran extends Terran
{
    /**
     * Act - do whatever the GuerreroTerran wants to do. This method is called whenever
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
    //Curacion
    if (isTouching(MedicTerran.class))
        {
             
             
             
            
        }
<<<<<<< HEAD
    
    
    }
    
   //Curacion
  
   
    
=======
        //encuentro con objeto
        if(isTouching(Arbol.class)&& Greenfoot.isKeyDown("right"))
        {
           if(getX()<900){
            setLocation(getX()-1,getY());
        }
        }
        if(isTouching(Arbol.class)&& Greenfoot.isKeyDown("left"))
        {
           if(getX()<900){
            setLocation(getX()+1,getY());
        }
        }
        if(isTouching(Arbol.class)&& Greenfoot.isKeyDown("up"))
        {
           if(getX()<1000){
            setLocation(getX(),getY()+1);
        }
        }
        if(isTouching(Arbol.class)&& Greenfoot.isKeyDown("down"))
        {
           if(getX()<1000){
            setLocation(getX(),getY()-1);
        }
        }
    }    
>>>>>>> master
}
