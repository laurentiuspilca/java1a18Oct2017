import java.util.Random;

public class Exemplu15 {

    public static void main(String [] args) {
        Random r = new Random();
        
        int a = r.nextInt();
        int b = r.nextInt(1000); // [0, 999]
        double c = r.nextDouble(); // [0, 1)    0.6984546546546
        
        boolean d = r.nextBoolean();
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}