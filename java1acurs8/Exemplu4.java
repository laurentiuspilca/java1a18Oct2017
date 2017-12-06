public class Exemplu4 {

    public static void main(String [] args) {
        C<Integer, Integer> c1 = new C<Integer, Integer>();
        C<Integer, String> c2 = new C<Integer, String>();
        C<String, Integer> c3 = new C<String, Integer>();
        
        C<?, ? extends Number> c4 = new C<String, Integer>();
        
        C<String, Integer> c5 = new C<>();
        C<?, ? extends Number> c6 = new C<>();
    }
}