import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Tor extends Animal
{

    public void act() 
    {
        if (canSee(Ball.class))
        {eat(Ball.class);
         Greenfoot.stop();
         Greenfoot.playSound("fanfare.wav");
    }    
    
}
}
