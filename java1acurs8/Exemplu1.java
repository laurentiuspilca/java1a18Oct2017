public class Exemplu1 {

    public static void main(String [] args) {
        
        
        A<Integer> a1;
        a1 = new A<Integer>();
        
        A<String> a2 = new A<String>();
        A<?> a3 = new A<String>();
        
        A<? extends Number> a4 = new A<Integer>();
        
        A<? super Integer> a5 = new A<Number>();
        A<? super Integer> a6 = new A<Object>();
        
        A<? extends Object> a7 = new A<Integer>();
        
        
    }
}