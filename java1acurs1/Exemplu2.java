/**
 * Aceasta este minunata clasa Exemplu 2
 * 
 * @author Laur
 * @version 1.1
 */

public class Exemplu2 {

    /**
     * Aici se declara metoda principala
     */
    public static void main(String [] args) {
        int zi  = 4; // Aceasta este o declarare
        
        switch (zi) {
            /*
             * Urmeaza cazul
             * pentru valoarea 1
             * Care va afisa luni!
             */
            case 1:
                System.out.println("Luni"); /* Aici afisez luni */
                break;
            case 2:
                System.out.println("Marti");
                break;
            case 3:
                System.out.println("Miercuri");
                break;
            case 4:
                System.out.println("Joi");
                break;
            case 5:
                System.out.println("Vineri");
                break;
            case 6:
            case 7:
                System.out.println("Weekend!");
                break;
            default:
                System.out.println("Eroare!");
        }
    }
}