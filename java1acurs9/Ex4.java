public class Ex4{

    public static void main(String [] args){
    
    
        OddNrThred t1=new OddNrThred();
        EvenNrRunnable r1=new EvenNrRunnable();
        Thread t2=new Thread(r1);
        
        t1.start();
        t2.start();
        
        System.out.println("THE END");
    }

}