public class NbEntier {
 private int val;
       
 public NbEntier(){
    val=0; }

 public NbEntier(int valeur){
   val=valeur;}

 public int setValue(int newVal){
    int oldval=val;
      val=newVal;
       return oldval;}

public int getValue(){
    return val;
    }
 public String toString(){
    return"("+ val+")";
  }
  }
