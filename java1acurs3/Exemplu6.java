public class Exemplu6 {
    public static void main(String [] args) {
        
        
        
        
        int[] v = new int[4];
        v[0] = 1;
        v[1] = 2;
        v[2] = 3;
        v[3] = 4;
        
        System.out.println("v[2] = " + v[2]);
        //v[4] = 5;
        
        for(int i = 0; i < 4; i++) {
            System.out.print(v[i] + " ");
        }
        
        for(int nr : v) {
            System.out.print(nr + " ");
        }
        
        
        
        int v2 [] = new int[10];
        int[] v3 = new int[]{10, 20, 30, 40, 50};
        int[] v4 = {1 , 2, 3, 4, 5};
        
        int[][] m1 = new int[4][3];
        m1[2][1] = 10;
        
        
        int[][] m2 = new int[4][];
        m2[0] = new int[4];
        m2[1] = new int[2];
        m2[2] = new int[1];
        m2[3] = new int[3];
        
        Masina[] masini = new Masina[10];
        masini[0] = new Masina("Dacia", 2015, "alb");
        System.out.println(masini[0].marca);
        
        
        
        
        
        
        
        
        
        
    }
}