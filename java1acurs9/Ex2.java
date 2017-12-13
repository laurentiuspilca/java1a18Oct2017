public class Ex2{

    public static void main(String [] args){
     
        EvenNrRunnable r1=new EvenNrRunnable();
        
        Thread t1=new Thread(r1);
        t1.start();
        
        System.out.println("THE END");
    
    
    }
}