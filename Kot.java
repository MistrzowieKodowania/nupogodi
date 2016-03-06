import greenfoot.*;

public class Kot extends Actor
{
    int gdzie;
    
    public void act() 
    {
        if(Greenfoot.isKeyDown("a")){
            gdzie=3;
            setLocation(370,210);
            setImage("kot.gif");
            getImage().mirrorHorizontally();}
        if(Greenfoot.isKeyDown("z")){
            gdzie=2;
            setLocation(370,460);
            setImage("kot.gif");
            getImage().mirrorHorizontally();}
        if(Greenfoot.isKeyDown("k")){
            gdzie=0;
            setLocation(430,210);
            setImage("kot.gif");}    
        if(Greenfoot.isKeyDown("m")){
            gdzie=1;
            setLocation(430,460);
            setImage("kot.gif");}    
    }    
}
