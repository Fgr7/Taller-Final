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
    
    


    
    
    

