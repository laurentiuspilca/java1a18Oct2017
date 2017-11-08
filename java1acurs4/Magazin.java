public class Magazin {

    private final Produs [] produse;
    
    public Magazin(Produs [] produse) {
        this.produse = copiereProduse(produse);
    }
    
    public Produs[] getProduse() {
        return copiereProduse(this.produse);
    }
    
    private static Produs[] copiereProduse(Produs[] produse) {
        Produs[] copie = new Produs[produse.length];
        
        for (int i=0 ;i<produse.length; i++) {
            copie[i] = produse[i];
        }
        
        return copie;
    }
}