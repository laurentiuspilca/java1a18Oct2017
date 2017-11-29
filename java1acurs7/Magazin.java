public class Magazin {
    private static Magazin instance;
    
    Produs [] produse = new Produs[100];
    int n;
    
    private Magazin() {
    }
    
    public static Magazin getInstance() {
        if (instance == null) {
            instance = new Magazin();
        }
        return instance;
    }
    
    public void adaugaProdus(Produs p) throws TooManyProductsException {
        if (n < 100) {
            produse[n] = p;
            n++;
        } else {
            throw new TooManyProductsException();
        }
    }
    
    public void afisareProduse() {
        for (int i=0 ; i<n; i++) {
            System.out.println(produse[i]);
        }
    }
    
    public void afisareCiocolate() {
        for (int i=0 ; i<n; i++) {
            if (produse[i] instanceof Ciocolata) {
                System.out.println(produse[i]);
            }
        }
    }
}