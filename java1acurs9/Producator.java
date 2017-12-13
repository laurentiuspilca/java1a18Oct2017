import java.util.*;

public class Producator extends Thread{

    public Producator(String nume){
        super(nume);
    }
    
    @Override
    public void run(){
    
        Random r=new Random();
        try {
            while(true){
            
                synchronized(Ex5.list) {
                    if(Ex5.list.size()<100){
                        int x = r.nextInt(1000);
                        Ex5.list.add(x);
                        
                        Ex5.list.notifyAll();
                        
                        System.out.println("Producator "+
                        Thread.currentThread().getName()+
                            "A adaugat "+ x);
                    } else {
                        Ex5.list.wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}