public class Exemplu1 {
    public static void main(String [] args) {
        
        
        
        
        
        System.out.println("numar produse = " + Produs.numar);
        
        Produs p1 = new Produs("pix", 2.5);
        Produs p2 = new Produs("telefon", 1500);
        
        System.out.println("numar produse = " + Produs.numar);
        System.out.println("numar produse = " + p1.numar);
        p2.numar = 10;
        System.out.println("numar produse = " + Produs.numar);
        //Produs.pret = 10; pret este atribut, nu este static
    }
}