    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
    /**
     * Write a description of class MyWorld here.
     * 
     * @author (your name) 
     * @version (a version number or a date)
     */
    public class MyWorld extends World
    {
    
        /**
         * Constructor for objects of class MyWorld.
         * 
         */
        public MyWorld()
        {    
            // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
            super(1000, 900, 1); 
            //creacion de un objeto
            MedicTerran medicT1= new MedicTerran();
            ConstructorTerran consT1=new ConstructorTerran();
            //MedicTerran medicT2= new MedicTerran();
            //agragar objeto
            addObject(medicT1, 170, 500);
            //addObject(medicT2, 120, 500);
            //addObject(consT1, 254,538);
            
           
          
        
    }
    public void act(){
            
            
        }
            
           
                
           
            
                
                
               
            
               
                
    
}

