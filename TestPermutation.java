public class TestPermutation{
public static void main (String [] args){
     NbEntier a=new NbEntier(10);
     NbEntier b=new NbEntier(5);
     
     System.out.println ("befort permutation b=" + a.getValue());
     Permutation.permute(a,b);
     System.out.println ("befort permutation a=" +a.getValue());
     
 
 }
 }
 

