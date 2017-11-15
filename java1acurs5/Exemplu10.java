public class Exemplu10 {

    public static void main(String [] args) {
        
        Predicat p1 = new Predicat() {
            public boolean test(int n) {
                return n % 2 == 0;
            }
        };
        
        boolean b1 = p1.test(10);
        
        Predicat p2 = n -> n % 2 == 0;
        
        boolean b2 = p2.test(10);
        
        Predicat p3 = (n) -> n > 10;
        Predicat p4 = (int n) -> n > 10;
        
        Predicat p5 = n -> { 
            return n > 10; 
        };
    }
}