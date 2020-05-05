import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Spieler extends Animal
{ public void act() 
    {
           {
    
      
    
      checkKeys();
    }
}
 
 private void checkKeys() 
    {
     
    if(Greenfoot.isKeyDown("left")) {
            setRotation(getRotation() - 3);
        }  
    if (Greenfoot.isKeyDown("up"))
       {move (4);
        }
    if (Greenfoot.isKeyDown("Down"))
       {move (-4);
        }
    if(Greenfoot.isKeyDown("right")) {
        setRotation(getRotation() + 3);
        }
    if (Greenfoot.isKeyDown("w"))
       {move (10);
        }
    }

}