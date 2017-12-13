import  java.util.*;

public class Consumator extends Thread{

public Consumator(String nume){

super(nume);

}
@Override
public void run(){
    while(true){
if(Ex5.list.size()>0){
 int x=Ex5.list.get(0);
 Ex5.list.remove(0);
 System.out.println("Consumatorul "+Thread.currentThread().getName()+"a consumat "+x);
}
}
}
}