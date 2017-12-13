import java.util.*;
public class Ex5{
    public static ArrayList<Integer> list=new ArrayList<>();
    
    public static void main(String [] args){
        Producator p1=new Producator("P1");
        Producator p2=new Producator("P2");
        Consumator c1=new Consumator("C1");
        Consumator c2=new Consumator("C2");
           
           p1.start();
           p2.start();
           c1.start();
           c2.start();
        
    
    
    
    }

}