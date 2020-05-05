import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Spielfeld extends World
{


    public Spielfeld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1500, 1024, 1); 
        addObject(new Tor(),1400, 512);
        addObject(new Tor(),1400, 412);
        addObject(new Tor(),1400, 612);
        addObject(new Tor(),1400, 462);
        addObject(new Tor(),1400, 562);
        
        addObject(new Tor(),100, 512);
        addObject(new Tor(),100, 412);
        addObject(new Tor(),100, 612);
        addObject(new Tor(),100, 462);
        addObject(new Tor(),100, 562);
        
        addObject(new Ball(),400, 512);
        addObject(new Spieler(),300, 450);
        
        addObject(new Enemy(), 1000, 400);
        addObject(new Enemy(), 1000, 200);
        addObject(new Enemy(), 1000, 600);
        addObject(new Enemy(), 1000, 800);
        
    }
}