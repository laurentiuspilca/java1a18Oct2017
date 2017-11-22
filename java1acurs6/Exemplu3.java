public class Exemplu3 {

    public static void main(String [] args) {
        String s1 = "HELLO";
        String s2 = "hello";
        String s3 = "HELLO";
        String s4 = "WORLD";
        System.out.println(s1.charAt(2));
        
        int a = s1.compareTo(s4);
        int b = s1.compareTo(s2);
        int c = s2.compareTo(s1);
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        int d = s1.compareToIgnoreCase(s2);
        System.out.println(d);
        
        boolean b1 = s1.equals(s2);
        boolean b2 = s1.equalsIgnoreCase(s2);
        
        System.out.println(b1 + " " + b2);
    }
}