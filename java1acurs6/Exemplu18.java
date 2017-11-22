import java.util.Scanner;
import java.util.Random;

public class Exemplu18 {

    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        
        int n = s.nextInt();
        
        for (int i=0; i<n; i++) {
            System.out.println(r.nextInt(1000));
        }
    }
}