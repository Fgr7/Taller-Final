    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
    /**
     * Write a description of class MyWorld here.
     * 
     * @author (your name) 
     * @version (a version number or a date)
     */
    public class Mapa extends World
    {
       
        //Creacion de objetos
        EnergiaTerran energy = new EnergiaTerran();
        EnergiaZerg energia = new EnergiaZerg();
        EnergiaMedicTerran vidaMT = new EnergiaMedicTerran();
        EnergiaGuerriTerran vidaGT = new EnergiaGuerriTerran();
        
        
        /**
         * Constructor for objects of class MyWorld.
         * 
         */
        
        
        public Mapa()
        {    
            // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
<<<<<<< HEAD:Mapa.java
            super(1000, 900, 1);
=======
            super(1000, 900, 1); 
            //creacion de un objeto
            MedicTerran medicT1= new MedicTerran();
            //ConstructorTerran consT1=new ConstructorTerran();
            //MedicTerran medicT2= new MedicTerran();
            //agragar objeto
            addObject(medicT1, 170, 500);
            //addObject(medicT2, 120, 500);
            //addObject(consT1, 254,538);
>>>>>>> master:MyWorld.java
            
        //Equipo Terran   
        MedicTerran medicT1= new MedicTerran();
        ConstructorTerran consT1=new ConstructorTerran();
        GuerreroTerran guerriT1 = new GuerreroTerran();
        
        //Equipo Zerg
        MedicZerg medicZ1 = new MedicZerg();
        
        //Invocacion Barras Energia/Vida Terra
        addObject(energy, 100, 40);
        addObject(vidaMT, 170, 500);
        addObject(vidaGT, 300, 600);
       
        //Invocacion Barras Energia/Vida Zerg
        addObject(energia, 800, 40);
        
        
        //Invocacion Equipo Terra
        addObject(medicT1, 170, 500);
        addObject(guerriT1, 300, 600);
        
        //Invocacion Equipo Zerg
        addObject(medicZ1, 200, 660);
        
    }
    
    //Contador de energia ambos equipos
    
    public EnergiaTerran getEnergiaTerran(){
        return energy;
    }
   
    public EnergiaZerg getEnergiaZerg(){
        return energia;
    }
    
    //Vida Terran
    
    public EnergiaMedicTerran getEnergiaMedicTerran(){
     
        return vidaMT;
        
    }
    
    public EnergiaGuerriTerran getEnergiaGuerriTerran(){
    
        return vidaGT;
        
    }
    
    
    public void act(){
       
        
    }
        
        
            

}

