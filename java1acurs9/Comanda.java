import java.util.*;

public class Comanda {
    private static Comanda SINGLETON;
    
    private List<Pizza> pizza = new ArrayList<>();
    
    private Comanda() {}
    
    public static Comanda getInstance() {
        if (SINGLETON == null) {
            SINGLETON = new Comanda();
        }
        return SINGLETON;
    }
    
    public void adaugaPizza(Pizza p) {
        pizza.add(p);
    }
    
    public Pizza getPizza(String serie) {
        for (Pizza p : pizza) {
            if (p.serie.equals(serie)) {
                return p;
            }
        }
        return null;
    }
    
    public List<Pizza> getAll() {
        return pizza;
    }
}