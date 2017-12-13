import  java.util.*;

public class Consumator extends Thread {

    public Consumator(String nume){
        super(nume);
    }
    
    @Override
    public void run(){
        try {
            while(true){
                
                synchronized(Ex5.list) {
                    if(Ex5.list.size()>0){
                         int x=Ex5.list.get(0);
                         Ex5.list.remove(0);
                         
                         Ex5.list.notifyAll();
                         
                         System.out.println("Consumatorul "+
                             Thread.currentThread().getName()+
                             "a consumat "+x);
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