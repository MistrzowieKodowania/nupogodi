import greenfoot.*;
import java.awt.Color;

public class Licznik extends Actor
{
    int pkt = 0;
    int zycie = 3;
    public void act() 
    {
      GreenfootImage klikniecia = new GreenfootImage ("Złapane: " + pkt +"\n Życia: " + zycie, 36, Color.RED, null);  
      setImage (klikniecia);
    }  
    public void dodajPunkt() {
      pkt++;
    }
    public void straconeZycie() {
      zycie--;
      if(zycie<1){
        GreenfootImage klikniecia = new GreenfootImage ("Złapane: " + pkt +"\n The End :( ", 36, Color.RED, null);  
        setImage (klikniecia);
        Greenfoot.stop();
        }
    }
}