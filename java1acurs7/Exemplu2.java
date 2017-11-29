public class Exemplu2 {

    public static void main(String [] args) {
        
        try {
            int x = 10 / 0;
        } finally {
            System.out.println("This must always happen! ");
        }
    }
}