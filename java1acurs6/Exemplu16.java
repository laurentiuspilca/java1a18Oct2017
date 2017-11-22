import java.util.Scanner;

public class Exemplu16 {

    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        
        String line = s.nextLine();
        
        StringBuilder sb = new StringBuilder(line);
        
        sb.reverse();
        
        System.out.println(sb);
    }
}