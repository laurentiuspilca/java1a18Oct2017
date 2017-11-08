public class Exemplu2 {

    public static void main(String [] args) {
        Produs p1 = new Produs("bere", 5);
        Produs p2 = new Produs("ciocolata", 8);
        
        Produs [] produse = new Produs[5];
        produse[0] = p1;
        produse[1] = p2;
        Magazin m = new Magazin(produse);
        
        System.out.println(m.getProduse()[0].getNume());
        System.out.println(m.getProduse()[0].getPret());
        
        Produs p3 = new Produs("bomboane", 3);
        produse[0] = p3;
        
        
        System.out.println(m.getProduse()[0].getNume());
        System.out.println(m.getProduse()[0].getPret());
    }
}