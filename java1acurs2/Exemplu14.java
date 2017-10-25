public class Exemplu14 {

    public static void main(String [] args) {
        
        Pisica p1;
        p1 = new Pisica();
        
        Pisica p2 = new Pisica();
        
        p1.nume = "Tom";
        
        p2.nume = "Leo";
        
        System.out.println(p1.nume);
        System.out.println(p2.nume);
    }
}