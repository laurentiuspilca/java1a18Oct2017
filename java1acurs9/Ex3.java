public class Ex3{

    public static void main(String[] args){
    
        Thread t=new Thread(()->afisareNumere());
        t.start();
        
    
    }
    public static void afisareNumere(){
        for(int i=0;i<30;i+=2)
        
        System.out.println(i);
        
        }

}