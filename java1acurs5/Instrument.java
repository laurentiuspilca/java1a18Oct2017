@FunctionalInterface
public interface Instrument {
    
    public static final int x = 10;

    public void play();
    
    
    default void m1() {
        System.out.println(":)");
    }
    
    
    static void m2 () {
        System.out.println(":(");
    }
}