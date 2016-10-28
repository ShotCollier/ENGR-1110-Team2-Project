import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class Room extends World
{
    public static int timer = 0;
    //GreenfootSound backgroundMusic = new GreenfootSound("backgroundmusic.mp3");
    public Room() 
    {
        super(500, 500, 1);
        GreenfootImage background = new GreenfootImage("RoomBack1.png");
        GreenfootImage background2 = new GreenfootImage("RoomBack2.png");
        setBackground(background);
        //backgroundMusic.playLoop();
        Hero hero = new Hero();
        addObject(hero, 212, 212);
        
        Perry perry = new Perry();
        addObject(perry, 212, 112);
    }
    public void act(){
        GreenfootImage background = new GreenfootImage("RoomBack1.png");
        GreenfootImage background2 = new GreenfootImage("RoomBack2.png");
    if((timer%60)==0){
        setBackground(background);
    }
    if((timer%60)==30){
        setBackground(background2);
    }
    timer += 1;
   }
}