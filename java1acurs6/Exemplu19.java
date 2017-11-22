import java.util.Scanner;

public class Exemplu19 {

    public static void main(String [] args) {
        
        Scanner s = new Scanner(System.in);
        
        String line = s.nextLine();
        
        String vowels = "aeiou";
        
        int c = 0;
        for (int i=0; i<line.length(); i++) {
            if (vowels.contains(String.valueOf(line.charAt(i)).toLowerCase())) {
                c++;
            }
        }
        
        System.out.println(c);
    }
}