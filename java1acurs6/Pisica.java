public class Pisica {

    String nume;
    String culoare;
    
    @Override
    public String toString() {
        return nume + " " + culoare;
    }
    
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Pisica)) return false;
        
        Pisica p = (Pisica) o;
        
        return this.nume.equals(p.nume);
    }
}