import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Enemy extends Animal
{
   
    public void act() 
    {move(-2);
       if (Greenfoot.getRandomNumber(100)<10)
     {turn (15);
         
     
     }   
     if (Greenfoot.getRandomNumber(100)<10)
    
        {turn (-15);
     }
     if (atWorldEdge())
     {turn(45);
         move(-100);
    }
    if (canSee(Spieler.class))
    {eat(Spieler.class);
    }
}
}