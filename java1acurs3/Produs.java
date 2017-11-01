public class Produs {
    String denumire;
    double pret;
    
    
    
    static int numar;
    
    static {
        numar = 0;
    }
    
    
    Produs(String denumire, double pret) {
        this.denumire = denumire;
        this.pret = pret;
        numar++;
    }
}