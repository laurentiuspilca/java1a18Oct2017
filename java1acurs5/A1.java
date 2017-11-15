public class A1 {
    
    private int x;
    private static int y;

    class A2 {
    
        public void m1 () {
            A1.this.x = 10;
        }
    }
    
    public static class A3 {
    
        public void m2 () {
            y = 10;
        }
    }
}