import greenfoot.*;
import java.awt.Color;

public class Licznik extends Actor
{
    int pkt, szansa;
    
    public Licznik(){
      GreenfootImage klikniecia = new GreenfootImage ("Jestem gotowy!", 36, Color.RED, null);  
      setImage (klikniecia);
      pkt = 0;
      szansa = 3;
    }
    public void act() 
    {
      GreenfootImage klikniecia = new GreenfootImage ("Złapane: " + pkt +"\n Szanse: " + szansa, 36, Color.RED, null);  
      setImage (klikniecia);
    }  
    public void dodajPunkt() {
      pkt++;
    }
    public void straconaSzansa() {
      szansa--;
      if(szansa<1){
        GreenfootImage klikniecia = new GreenfootImage ("Złapane: " + pkt +"\n The End :( ", 36, Color.RED, null);  
        setImage (klikniecia);
        Greenfoot.stop();
        }
    }
}