public class Animal {
    String specie;
    
    
    
    
    Animal(String specie) {
        this.specie = specie;
    }
    
    void seHraneste() {
        System.out.println("Animalul se hraneste.");
    }
    
    void seHraneste(String hrana) {
        System.out.println("Animalul se hraneste cu " + hrana);
    }
    
    void seHraneste(boolean ziua) {
        System.out.println(ziua ? "Animalul se hraneste ziua." :
                                  "Animalul se hraneste noaptea.");
    }
    
    void seHraneste(String hrana, int cantitate) {
        System.out.println("Animalul se hraneste cu " + hrana + 
                        " in cantitate de " + cantitate + " grame");
    }
    
    void seHraneste(int frecventa, String hrana) {
        System.out.println("Animalul se hraneste cu " + hrana + 
                        " de " + frecventa + " pe zi");
    }
    
    
    
    
    
    
    
    
    
    
}