import greenfoot.*;

public class Wilk extends Actor
{
    int gdzie;
    
    public void act() 
    {
        if(Greenfoot.isKeyDown("a")){
            gdzie=3;
            setLocation(390,240);
            setImage("nupogodi.png");
            getImage().mirrorHorizontally();}
        if(Greenfoot.isKeyDown("z")){
            gdzie=2;
            setLocation(390,490);
            setImage("nupogodi.png");
            getImage().mirrorHorizontally();}
        if(Greenfoot.isKeyDown("k")){
            gdzie=0;
            setLocation(410,240);
            setImage("nupogodi.png");}    
        if(Greenfoot.isKeyDown("m")){
            gdzie=1;
            setLocation(410,490);
            setImage("nupogodi.png");}    
    }    
}
