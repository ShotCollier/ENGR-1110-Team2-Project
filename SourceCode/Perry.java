import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Perry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Perry extends Enemy 
{
    private GreenfootImage perry = new GreenfootImage("rocketWithThrust.png");
    private int DistanceX;
    private int DistanceY;
    private int moveOnce = 0;
    /**
     * Act - do whatever the Perry wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Perry(){
        setImage(perry);
    }
    public void act() 
    {
        move();
        Actor hero = (Actor)getWorld().getObjects(Hero.class).get(0);
        int DistanceX = getX() - hero.getX();
        int DistanceY = getY() - hero.getY();
    }
    public void move() {
        Actor hero = (Actor)getWorld().getObjects(Hero.class).get(0);
        if((Room.timer%60)>30){
            moveOnce = 0;
        }
        if((Room.timer%60)<30) {
            if( DistanceX < DistanceY) {
                if (DistanceX <= 75) {
                    if(hero.getX() >= 250) {
                        //setRotation(180);
                        super.setLocation(getX()-25, getY());
                        moveOnce = 1;
                    } else {
                        //setRotation(0);
                        super.setLocation(getX()+25, getY());
                        moveOnce = 1;
                    }
                } else {
                    if(Greenfoot.getRandomNumber(1)==1) {
                        //setRotation(0);
                        super.setLocation(getX()-25, getY());
                        moveOnce = 1;
                    } else {
                        //setRotation(180);
                        super.setLocation(getX()+25, getY());
                        moveOnce = 1;
                    }
                }
            } else {
                if (DistanceY <= 75) {
                    if(hero.getY() >= 250) {
                        //setRotation(90);
                        super.setLocation(getX(), getY()-25);
                        moveOnce = 1;
                    } else {
                        //setRotation(270);
                        super.setLocation(getX(), getY()+25);
                        moveOnce = 1;
                    }
                } else {
                    if(Greenfoot.getRandomNumber(1) == 1) {
                        //setRotation(90);
                        super.setLocation(getX(), getY()-25);
                        moveOnce = 1;
                    } else {
                        //setRotation(270);
                        super.setLocation(getX(), getY()+25);
                        moveOnce = 1;
                    }
                }
            }
        }
    } 
}
