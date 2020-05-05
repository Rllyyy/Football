import greenfoot.*;



public class Ball extends Animal
{  private boolean isDown;
    
    public void act()
    { 
       {if (canSee(Spieler.class))
        move(4); }
       if (atWorldEdge())
       {turn(45);
           move (4);
        }
       if ( canSee(Spieler.class) && Greenfoot.isKeyDown("f") ) 
       { move (-8);
   
       }
       if (Greenfoot.isKeyDown("q"))
       {turn(-5);}
       if (Greenfoot.isKeyDown("e"))
       {turn(5);}
    }
}
        
     
    
