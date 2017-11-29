public class Exemplu1 {

    public static void main(String [] args) {
        
        try {
            exceptionForNumber(150);
        } catch (MyException e) {
            System.out.println("Bau!");
        }
    }
    
    private static void exceptionForNumber(int x) throws MyException {
        if (x > 100) {
           MyException e = new MyException();
           throw e; 
        }
    }
}