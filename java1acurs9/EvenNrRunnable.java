public class EvenNrRunnable implements Runnable{
    @Override
    public void run(){
    for(int i=0;i<30;i+=2){
    
        System.out.println(i);
         try{
            Thread.sleep(100);
        }catch(InterruptedException e){
            System.out.println("Mesaj1");
        
        }
    
    }
    
    }


}