import greenfoot.*;

public class Jajko extends Actor
{
    int zmianaX, obrot, gdzie, n=0;
     
    public Jajko(int gdzie){
        this.gdzie=gdzie;
        
        if(gdzie<2) {
          setRotation(-30);
          zmianaX = -51;
          obrot = -30;
        } else{
          setRotation(30);
          zmianaX = 51;
          obrot = 30;
        }
    }
        
    public void act() 
    {   Kurnik swiat = (Kurnik) getWorld();
        if(n<5) {setLocation(getX()+zmianaX, getY()+30);
                 turn(obrot); 
                 if(n==3){swiat.dodajJajko();}
                }
        else if(n==5){
            if(gdzie==swiat.scratchus.gdzie){
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
                swiat.napis.straconaSzansa();
                getWorld().removeObject(this); }
               }
        n++;
    }  
        
}
