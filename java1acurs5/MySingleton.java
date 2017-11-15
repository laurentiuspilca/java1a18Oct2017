public class MySingleton {
    private static MySingleton SINGLETON;

    private MySingleton() {
    }
    
    public static MySingleton getInstance() {
        if (SINGLETON == null) {
            SINGLETON = new MySingleton();
        }
        
        return SINGLETON;
    }
}