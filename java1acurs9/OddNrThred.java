public class OddNrThred extends Thread{


    @Override
    public void run(){
        for(int i=1;i<30;i+=2){
        
            System.out.println(i+" "+Thread.currentThread().getName());
            try{
            Thread.sleep(100);
        }catch(InterruptedException e){
            System.out.println("Mesaj1");
        
        }
        }
    
    }
}