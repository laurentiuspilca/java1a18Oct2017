public class Pisica implements Comparable<Pisica> {

    String nume;
    int varsta;
    
    public Pisica(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }
    
    @Override
    public int compareTo(Pisica p) {
        return this.varsta - p.varsta;
    }
    
    @Override
    public String toString() {
        return nume + " " + varsta;
    }
}