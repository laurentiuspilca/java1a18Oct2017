public class Angajat {

    double salariu;
    int vechime;
    
    public Angajat(double salariu, int vechime) {
        this.salariu = salariu;
        this.vechime = vechime;
    }
    
    public double getSalariu() {
        if (vechime >= 5) {
            return salariu + 100;
        } else {
            return salariu;
        }
    }
}