import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Inicio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Inicio extends World
{
    JUGAR jugar = new JUGAR();
    MedicTerran mt = new MedicTerran();
    GuerreroTerran gt = new GuerreroTerran();
    ConstructorTerran ct = new ConstructorTerran();
    
    MedicZerg mz = new MedicZerg();
    GuerreroZerg gz = new GuerreroZerg();
    ConstructorZerg cz = new ConstructorZerg();
    /**
     * Constructor for objects of class Inicio.
     * 
     */
    public Inicio()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(626, 447, 1); 
        addObject(jugar, 303, 423);
        addObject(mt, 58, 140);
        addObject(gt, 90, 250);
        addObject(ct, 150, 190);
        addObject(mz, 500, 140);
        addObject(gz, 550, 250);
        addObject(cz, 450, 220);
    }
}
