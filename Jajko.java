import greenfoot.*;

public class Jajko extends Actor
{
    int zmianaX, zmianaY, obrot, n=0, gdzie;
     
    public Jajko(int gdzie){
        this.gdzie=gdzie;
        
        if(gdzie<2) {
          setRotation(-30);
          zmianaX = -17;
          zmianaY = 10;
          obrot = -30;
        } else{
          setRotation(30);
          zmianaX = 17;
          zmianaY = 10;
          obrot = 30;
        }
    }
    
    
    public void act() 
    {   Kurnik swiat = (Kurnik) getWorld();
        if(n<5) {setLocation(getX()+3*zmianaX, getY()+3*zmianaY);
                 turn(obrot); 
                 if(n==3){swiat.dodajJajko();}
                }
        else if(n==5){
            if(gdzie==swiat.wilk.gdzie){
                swiat.napis.dodajPunkt();
                getWorld().removeObject(this);}}         
        else if(n<7) {setLocation(getX(), getY()+50);
        } else{setRotation(0);
            setImage("kaczka.png");
            if(obrot>0){
            setRotation(180);
            getImage().mirrorVertically();
            }
            move(50);
            if(isAtEdge()){
                swiat.napis.straconeZycie();
                getWorld().removeObject(this); }
               }
               
        n++;
    }  
        
}
