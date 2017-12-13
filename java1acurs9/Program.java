import java.util.*;

public class Program {

    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        
        
        while (true) {
            System.out.print("Comanda: ");
            String cmd = s.nextLine();
            
            String [] cuv = cmd.split("\\s+");
            
            switch (cuv[0]) {
                case "exit":
                    System.out.println("Aplicatia se inchide...");
                    return;
                
                case "ap": {
                    String serie = cuv[1];
                    double pret = Double.parseDouble(cuv[2]);
                    
                    Prosciuto p = new Prosciuto();
                    p.serie = serie;
                    p.pret = pret;
                    
                    Comanda.getInstance().adaugaPizza(p);
                    System.out.println("Am adaugat o pizza prosciuto");
                } break;
                
                case "ac": {
                    String serie = cuv[1];
                    double pret = Double.parseDouble(cuv[2]);
                    
                    Calzone c = new Calzone();
                    c.serie = serie;
                    c.pret = pret;
                    
                    Comanda.getInstance().adaugaPizza(c);
                    System.out.println("Am adaugat o pizza calzone");
                    
                }break;
                
                case "get": {
                    String serie = cuv[1];
                    Pizza p = Comanda.getInstance().getPizza(serie);
                    System.out.println(p);
                } break;
                
                case "getall": {
                    List<Pizza> pizza = Comanda.getInstance().getAll();
                    pizza.forEach(System.out::println);
                } break;
                    
                default:
                    System.out.println("Comanda incorecta!");
            }
        }
    }
}