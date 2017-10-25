public class Exemplu3 {

    public static void main(String [] args) {
        
        
        int x = 10;
        int y = 20;
        
        String rez;
        /*
        if (x < y) {
            rez = "HELLO";
        } else {
            rez = "WORLD!";
        }
        */
        
        rez = x < y ? "HELLO" : "WORLD!";
       
        System.out.println(rez);
    }
}