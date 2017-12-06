public class Exemplu2 {

    public static void main(String [] args) {
        
        
        
        A<Integer> a1 = new A<Integer>();
        a1.x = 10;
        
        A<String> a2 = new A<String>();
        a2.x = "HELLO";
        
        A<Number> a3 = new A<Number>();
        a3.x = 10;
        
        A<? extends Number> a4 = new A<Integer>();
        //a4.x = 10;
        
        A<?> a5 = new A<Integer>();
        //a5.x = 10;
        
        A<? super Integer> a6 = new A<Integer>();
        a6.x = 10;
    }
}