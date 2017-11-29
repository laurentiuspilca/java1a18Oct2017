public class Exemplu4 {

    public static void main(String [] args) {
        String s = null;
        
        try {
            int x = 10/0;
            System.out.println(x);
            System.out.println(s.length());
        } catch (ArithmeticException e) {
            System.out.println("A aparut o problema ArithmeticException!");
        } catch (NullPointerException e) {
            System.out.println("A aparut o problema NullPointerException!");
        } catch (Exception e) {
            System.out.println("All the exceptions!");
        }
        
    }
}