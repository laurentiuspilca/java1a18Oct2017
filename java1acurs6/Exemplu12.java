public class Exemplu12 {

    public static void main(String [] args) {
        Pisica p1 = new Pisica();
        p1.nume = "Tom";
        p1.culoare = "alb";
        
        Pisica p2 = new Pisica();
        p2.nume = "Tom";
        p2.culoare = "alb";
        
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
    }
}