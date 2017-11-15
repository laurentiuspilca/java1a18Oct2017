public class Exemplu11 {

    public static void main(String [] args) {
        
        
        Functie f1 = (a,b) -> a + b;
        Functie f2 = (int a, int b) -> a * b;
        
        
        Producator p1 = () -> 5;
        
        int x = 10;
        Producator p2 = () -> {
            //x = 5;
            return x;
        };
    }
}