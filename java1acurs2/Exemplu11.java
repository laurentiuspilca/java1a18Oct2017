public class Exemplu11 {

    public static void main(String [] args) {
        
        int i = 1;
        
        for (;;) {
            System.out.println(i);
            i++;
            if (i == 11) {
                break; 
            }
        }
        
        System.out.println(i);
    }
}