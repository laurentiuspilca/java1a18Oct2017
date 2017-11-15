public class Exemplu9 {

    public static void main(String [] args) {
        
        
        Instrument i1 = new Instrument() {
            
            @Override
            public void play() {
                System.out.println(" LALALA ");
            }
        };
        
        Instrument i2 = () -> System.out.println(" LALALA ");
    }
}