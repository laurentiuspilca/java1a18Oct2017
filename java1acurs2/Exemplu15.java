public class Exemplu15 {

    public static void main(String [] args) {
        
        Pisica p1 = new Pisica("Tom", 3);
        Pisica p2 = new Pisica("Leo", 3);
        
        p1.rasa = "birmanez";
        p1.culoare = "alb";
        
        
        System.out.println(p1.nume + " " + p1.varsta);
        
        p1.spuneMiau();
        p2.spuneMiau();
    }
}