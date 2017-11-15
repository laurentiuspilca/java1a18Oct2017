public class B1 {
    
    private int x;

    public void m1 (int w) {
        
        int k = 10;
    
        class B2 {
        
            public void m3() {
                B1.this.x = 10;
                System.out.println(k);
            }
        }
       
    }
    
    public static void m2 () {
        
        class B3 {
            
            public void m4 () {
                
            }
        }
    }
}