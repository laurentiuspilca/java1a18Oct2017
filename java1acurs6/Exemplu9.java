public class Exemplu9 {

    public static void main(String [] args) {
        String s1 = "HELLO";
        
        s1.concat("WORLD");
        
        System.out.println(s1);
        
        StringBuilder s2 = new StringBuilder("HELLO");
        
        s2.append("WORLD");
        
        System.out.println(s2);
    }
}