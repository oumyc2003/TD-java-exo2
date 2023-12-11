 import java. awt.*;
 
    public class Robot{
       String nom;
       private Point position;
        int vitesse;
         private int niveau;

public Robot (String Beuzy){
   nom=Beuzy;
   position=new Point(0,0);
   vitesse=0;

  }
public Robot (String Beuzy, int x, int y, int vitesse){
     nom=Beuzy;
     position=new Point(x,y);
     this. vitesse=vitesse;
  }
public void allerALEst(){
   position. translate(0, -vitesse);
      }

public void allerALOuEst(){
      position. translate(0, vitesse);
   }
public void allerAuNord(){
      position. translate(0, vitesse);
      
   }

public void allerAusud(){
     position. translate(0,-vitesse);
   }

public void accelerer(){
      if(vitesse<10){
        vitesse ++ ;}
      }

public void decelerer(){
       vitesse--;
      }
public void stop(){
      vitesse=0;
      stop();
 }
 public void nbrdeplacement(){}
 
 public void setNiveau(int n) {
 
      niveau = n;
 }
 
 public void getNiveau() {
 
        return niveau;
        
      if (niveau <= 0){
       stop();}
  }
       
 public void sePromener() {
 //j'ai pas comprie le méthode statique Math.random()//
 while (niveau > 0) {
            
            int direction ;

            switch (direction) {
                case 0:
                    allerALEst();
                    break;
                case 1:
                    allerALOuEst();
                    break;
                case 2:
                    allerAuNord();
                    break;
                case 3:
                    allerAusud();
                    break;
            }
 
 }
 }
 
public void getPosition(){

     return position;
   }
public void sePresenter(){

System.out.println("nom:" + nom +"position" +position);
}


}

