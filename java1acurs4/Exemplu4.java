public class Exemplu4 {

    public static void main(String [] args) {
        Animal a1 = new Animal();
        
        Animal a2 = new Mamifer();
        Animal a3 = new Delfin();
        
        Animal a4 = new Reptila();
        Animal a5 = new Sarpe();
        
        Mamifer m1 = new Delfin();
        Reptila r1 = new Sarpe();
        
        Reptila r2 = (Reptila) a4;
        
        //Delfin d1 = new Sarpe();
    }
}