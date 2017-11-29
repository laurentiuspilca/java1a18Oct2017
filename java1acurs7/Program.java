import java.util.Scanner;

public class Program {

    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        
        while(true) {
            System.out.print("Comanda:");
            String cmd = s.nextLine();
            
            String [] cuv = cmd.split("\\s+");
            
            switch (cuv[0]) {
                case "exit":
                    System.out.println("Bye bye...");
                    return;
                
                case "ac": {
                    Ciocolata c = new Ciocolata();
                    c.nume = cuv[1];
                    c.pret = Double.parseDouble(cuv[2]);
                    c.kCal = Integer.parseInt(cuv[3]);
                    try {
                        Magazin.getInstance().adaugaProdus(c);
                        System.out.println("A fost adaugata o ciocolata!");
                    } catch (TooManyProductsException e) {
                        System.out.println("Produsul nu poate fi adaugat!");
                    }
                }break;  
                
                case "ab": {
                    Bere c = new Bere();
                    c.nume = cuv[1];
                    c.pret = Double.parseDouble(cuv[2]);
                    c.pa = Double.parseDouble(cuv[3]);
                    try {
                        Magazin.getInstance().adaugaProdus(c);
                        System.out.println("A fost adaugata o bere!");
                    } catch (TooManyProductsException e) {
                        System.out.println("Produsul nu poate fi adaugat!");
                    }
                }break;  
                
                case "afisare":
                    Magazin.getInstance().afisareProduse();
                break;
                
                case "cioco":
                    Magazin.getInstance().afisareCiocolate();
                break;
            }
        }
    }
}