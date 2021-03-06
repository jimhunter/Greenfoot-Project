import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Space here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Space extends World
{
    
    private Star[]stars = new Star[210];
    Color color1 = new Color(123,230,30);
    Color color2 = new Color(123,150,230);
    Color color3 = new Color(123,50,200);
    int a, b, c;
    //private TurretGun turretGun;
    /**
     * Constructor for objects of class Space.
     * 
     */
    public Space()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 900, 1);
        
        GreenfootImage image = getBackground();
        image.setColor(Color.BLACK);
        image.fill();
        star();
        
        TurretBase turretBase = new TurretBase();
        TurretGun turretGun = new TurretGun();
        PlayerShip playerShip = new PlayerShip();
        addObject (turretBase, 1200, 860);
        addObject (turretGun, 1200, 860);
        addObject (playerShip, 100, 450);
        turretGun.setRotation (180);
         

    }
    
    private void star()
    {
        
     for(int i=0; i<210; i++){
         Star star;
         a = Greenfoot.getRandomNumber(1);
         b = Greenfoot.getRandomNumber(1);
         c = Greenfoot.getRandomNumber(1);
         
         if(i<70){
            star = new Star(-1-a,color1);
            addObject(star,star.x,star.y);
            stars[i]=star;
            }
         if(i>=70 && i<140){
            star = new Star(-3-b,color2);
            addObject(star,star.x,star.y);
            stars[i]=star;
            }
         if(i>=140){
            star = new Star(-5-c,color3);
            addObject(star,star.x,star.y);
            stars[i]=star;
            }
         
            
            //addObject (new Star (radius, new Color(r, g, b)), x, y);
        }
    }
    
    public void act()
    {

            for(int i = 0; i<210; i++){
                if(stars[i] != null) {
                    stars[i].move();
                }
            }

    }
}
