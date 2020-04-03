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
        
        /**
         * Constructor for objects of class MyWorld.
         * 
         */
        
        
        public Mapa()
        {    
            // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
            super(1000, 900, 1);
        MedicTerran medicT1= new MedicTerran();
        ConstructorTerran consT1=new ConstructorTerran();
        MedicZerg medicZ1 = new MedicZerg();
        addObject(energy, 100,40);
        addObject(energia, 800,40);
        addObject(medicT1, 170, 500);
        addObject(medicZ1,200,660);
    }
    
    //Contador de energia
    public EnergiaTerran getEnergiaTerran(){
        return energy;
    }
    public EnergiaZerg getEnergiaZerg(){
        return energia;
    }
    public void act(){
       
        
    }
        
        
            

}

