import greenfoot.*;

public class Kurnik extends World
{
    Licznik napis;
    Wilk wilk;
    public Kurnik()
    {    
        super(800, 600, 1); 
        wilk= new Wilk();
        addObject(wilk, 400, 500);
        
        Grzeda grzeda1 = new Grzeda();
        addObject(grzeda1, 685, 150);
        grzeda1.setRotation(-30);
        Grzeda grzeda2 = new Grzeda();
        addObject(grzeda2, 685, 400);
        grzeda2.setRotation(-30);
        Grzeda grzeda3 = new Grzeda();
        addObject(grzeda3, 115, 150);
        grzeda3.setRotation(30);
        Grzeda grzeda4 = new Grzeda();
        addObject(grzeda4, 115, 400);
        grzeda4.setRotation(30);
        
        napis = new Licznik();
        addObject(napis, 400, 50);
        Greenfoot.setSpeed(20);
    }
    
    public void act(){
        Greenfoot.setSpeed(20+(int)napis.pkt/5);
        //int wiecejJajek = (int) napis.pkt/5 + 7;
      if(numberOfObjects()<7){
        dodajJajko();
        }
    }
    
    public void dodajJajko(){
       int gdzieJajko = Greenfoot.getRandomNumber(4);
       switch (gdzieJajko) {
        case 0:
          addObject(new Jajko(0), 775, 55);
          break;
        case 1:
          addObject(new Jajko(1), 775, 305);
          break;
        case 2:
          addObject(new Jajko(2), 25, 305);
          break;
        case 3:
          addObject(new Jajko(3), 25, 55);
          break;        
        }
    }
}
