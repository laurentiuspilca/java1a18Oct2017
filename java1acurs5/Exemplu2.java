public class Exemplu2 {

    public static void main(String [] args) {
        Matematician m = new Matematician();
        
        Cerc c1 = new Cerc(10);
        
        double rez = m.calculeaza(c1);
        
        System.out.println(rez);
    }
}