public class Pisica {

    String culoare;
    String rasa;
    int varsta;
    final String nume;
    
    Pisica(final String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
        System.out.println("Constructor");
    }
    
    {
        System.out.println("A");
    }
    
    {
        System.out.println("B");
    }
    
    
    void spuneMiau() {
        System.out.println("Miau! Numele meu este " + this.nume);
    }
}