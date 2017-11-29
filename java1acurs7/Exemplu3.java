public class Exemplu3 {

    public static void main(String [] args) {
        System.out.println(getNumber());
    }
    
    public static int getNumber() {
        
        try {
            return 10;
        } finally {
            return 11;
        }
    }
}