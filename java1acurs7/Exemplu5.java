public class Exemplu5 {

    public static void main(String [] args) {
        try {
            int x = 10 / 5;
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("Oooops!");
        } finally {
            System.out.println("Finally!");
        }
    }
}