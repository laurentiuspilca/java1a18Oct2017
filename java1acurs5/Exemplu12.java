public class Exemplu12 {

    public static void main(String [] args) {
        MySingleton s1 = MySingleton.getInstance();
        MySingleton s2 = MySingleton.getInstance();
        
        if (s1 == s2) {
            System.out.println("SUNT EGALE");
        }
    }
}