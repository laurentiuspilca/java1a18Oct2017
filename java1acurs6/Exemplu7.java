public class Exemplu7 {

    public static void main(String [] args) {
        
        
        String s1 = "mere,pere,cirese,banane";
        String [] fructe = s1.split(",");
        
        for (String f : fructe) {
            System.out.println(f);
        }
        
        String s2 = "Mai multe     spatii  si nu    stim cate    si unde!";
        String [] cuvinte = s2.split("\\s+");
        
        for (String c : cuvinte) {
            System.out.println(c);
        }
    }
}