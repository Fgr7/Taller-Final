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
<<<<<<< HEAD
      
        //combate
        int a = 1;
        World myWorld = getWorld();
        Mapa mapa = (Mapa)myWorld;
        if(isTouching(MedicZerg.class)&& Greenfoot.getRandomNumber(100)==3)
        {
             
             
             EnergiaMedicTerran vidaMT = mapa.getEnergiaMedicTerran();
             vidaMT.removervidaMT();
             a = vidaMT.vidaMT;
            
        }
         if( a <= 0 )
             {
             getWorld().removeObjects(getWorld().getObjects(EnergiaMedicTerran.class));   
             getWorld().removeObjects(getWorld().getObjects(MedicTerran.class));
            EnergiaTerran energy = mapa.getEnergiaTerran(); 
             energy.removenergy();
            }
       
     EnergiaGuerriTerran vidaGT = mapa.getEnergiaGuerriTerran();
        
     int i = 0;
     
    while ( i < 2 ) {
     
         i++;  
           
       if(isTouching(GuerreroTerran.class) )
=======
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
        //combate
        if(isTouching(MedicZerg.class)&& Greenfoot.getRandomNumber(100)==3)
>>>>>>> master
        {
            
            EnergiaMedicTerran vidaMT = mapa.getEnergiaMedicTerran();
            
             vidaMT.curarMT();
             vidaGT.ganarvidaGT();
             
             if( vidaMT.vidaMT <= 0 )
             {
             getWorld().removeObjects(getWorld().getObjects(EnergiaMedicTerran.class));   
             getWorld().removeObjects(getWorld().getObjects(MedicTerran.class));
            EnergiaTerran energy = mapa.getEnergiaTerran(); 
             energy.removenergy();
            }
            
        
    }
}
    }
    }
    
    


    
    
    

