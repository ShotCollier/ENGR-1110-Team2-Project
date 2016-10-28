import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class Hero extends Actor
{
    private GreenfootImage hero = new GreenfootImage("explosion.png");
    private int moveOnce = 0;
    private int HP = 10;
    private int mercy = 0;
    public Hero()
    {
       setImage(hero);
    }
    public void act()
    {
        if((Room.timer%60)>30){
            moveOnce = 0;
        }
        if((Room.timer%30)>15){
            mercy = 0;
        }
        checkKeys();
        checkCollision();
        getWorld().showText("Health: " + HP, 50, 10);
    }
    /**
     * Check whether we are colliding with an asteroid.
     */
    private void checkCollision() 
    {
        
    }
    
    /**
     * Check whether there are any key pressed and react to them.
     */
    private void checkKeys() 
    {
        if((Greenfoot.getKey() != null) & (Room.timer%60)>30){
            if(mercy == 0){
                HP -= 1;
                mercy = 1;
                if(HP == 0){
                    Greenfoot.stop();
                }
            }
        }
        if(Greenfoot.isKeyDown("w")& (Room.timer%60)<30){
            if(moveOnce == 0 & getY()>12){
                setLocation(getX(), getY()-25);
                moveOnce = 1;
            }
        }
        if(Greenfoot.isKeyDown("a")& (Room.timer%60)<30) {
            if(moveOnce == 0 & getX()>12){
                setLocation(getX()-25, getY());
                moveOnce = 1;
            }
        }        
        if(Greenfoot.isKeyDown("d")& (Room.timer%60)<30) {
            if(moveOnce == 0 & getY()<488){
                setLocation(getX()+25, getY());
                moveOnce = 1;
            }
        }     
        if(Greenfoot.isKeyDown("s")& (Room.timer%60)<30){
            if(moveOnce == 0 & getY()<488){
                setLocation(getX(), getY()+25);
                moveOnce = 1;
            }
        }
    }
}