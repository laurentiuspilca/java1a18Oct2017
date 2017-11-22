public class Exemplu13 {

    public static void main(String [] args) {
        String s1 = "HELLO";
        String s2 = "HELLO";
        String s3 = new String("HELLO");
        
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s2));
    }
}