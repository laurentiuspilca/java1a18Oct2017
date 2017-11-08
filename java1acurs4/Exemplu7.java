public class Exemplu7 {

    public static void main(String [] args) {
        for (Tip t : Tip.values()) {
            for (Numar n : Numar.values()) {
                System.out.println(n + " DE " + t);
            }
        }
    }
}