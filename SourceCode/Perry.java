import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Perry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Perry extends Enemy
{
    /**
     * Act - do whatever the Perry wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Hero h = new Hero();
    int DistanceX = getX() - h.getX();
    int DistanceY = getY() - h.getY();
    
    public void act() 
    {
        move();
    }
    public void move() {
        /* find the X of this and then X of Hero
         * find the Y of this and then Y of Hero
         * 
         * if X > Y 
         * move based on the Heros X is < or > than This
         * 
         * else move based on the Heros Y < or > than This */
        
        
        if( DistanceX < DistanceY) {
            // change the distance to check DistanceX to based on world grid
            if (DistanceX <= 75) {
                //
            } else {
                //
            }
        } else {
            if (DistanceY <= 75) {
                //
            } else {
                //
            }
        }
    }
}
