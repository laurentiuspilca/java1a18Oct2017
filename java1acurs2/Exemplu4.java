public class Exemplu4 {
    
    public static void main (String [] args) {
        
        int h1=10, m1=40, s1=30;
        int h2=10, m2=50, s2=40;
        
        if (s1 + s2 >= 60) {
            s1 += s2 - 60;
            m1++;
        } else {
            s1 += s2;
        }
        
        if (m1 + m2 >= 60) {
            m1 += m2 - 60;
            h1 = h1 + 1;
        } else {
            m1 = m1 + m2;
        }
        
        h1 = h1 + h2;
        
        System.out.println(h1 + ":" + m1 + ":" + s1);
    }
    
}