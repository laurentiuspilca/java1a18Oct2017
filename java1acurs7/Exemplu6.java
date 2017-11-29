public class Exemplu6 {

    public static void main(String [] args) {
        
        
        try (
            Door d1 = new Door("A");
            Door d2 = new Door("B");
        ) {
            
           // folosesc usa
           throw new RuntimeException("R1");
        } catch (RuntimeException e1) { 
            System.out.println(e1.getMessage());
            Throwable [] t = e1.getSuppressed​();
            for (Throwable x : t) {
                System.out.println(x.getMessage());
            }
        } finally {
            System.out.println("Finally");
        }
    }
}