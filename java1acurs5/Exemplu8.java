public class Exemplu8 {

    public static void main(String [] args) {
        
        
        Angajat a1 = new Angajat(1000, 3);
        Angajat a2 = new Angajat(1000, 7);
        Angajat gigel = new Angajat(1000, 1) {
            
            public double getSalariu() {
                return 5000;
            }
            
        };
        
        System.out.println(a1.getSalariu()); // 1000
        System.out.println(a2.getSalariu()); // 1100
        System.out.println(gigel.getSalariu()); // 1000 ???
    }
}