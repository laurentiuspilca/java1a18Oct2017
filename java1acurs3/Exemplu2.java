public class Exemplu2 {
    public static void main(String [] args) {
        Punct a = new Punct(1, 2);
        Punct b = new Punct(3, 4);
        
        
        System.out.println("distanta = " + a.calculeazaDistanta(b));
        System.out.println("distanta = " + 
                            Punct.calculeazaDistantaStatic(a, b));
    }
}