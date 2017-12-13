public class Ex1{

    public static void main(String [] args){
    
    OddNrThred t1=new OddNrThred();
    t1.start();
    System.out.println("ThE END "+Thread.currentThread().getName());
    
    
    }
}