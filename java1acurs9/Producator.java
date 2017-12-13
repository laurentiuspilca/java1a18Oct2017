import java.util.*;
public class Producator extends Thread{

    public Producator(String nume){
    super(nume);
    
    }
    
    @Override
    public void run(){
    
    Random r=new Random();
    
    while(true){
    
    if(Ex5.list.size()<100){
    
    int x=r.nextInt(1000);
    Ex5.list.add(x);
    
    System.out.println("Producator "+Thread.currentThread().getName()+"A adaugat "+x);
    
    }
    
    }
    
    }
}