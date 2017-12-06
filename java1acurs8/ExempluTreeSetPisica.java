import java.util.*;

public class ExempluTreeSetPisica {

    public static void main(String [] args) {
        /**
        Comparator<Pisica> c = new Comparator<Pisica>() {
            
            @Override
            public int compare(Pisica p1, Pisica p2) {
                return p1.nume.compareTo(p2.nume);
            }
            
        };
        */
       
        TreeSet<Pisica> pisici = 
            new TreeSet<>((p1,p2) ->  p1.nume.compareTo(p2.nume));
        
        pisici.add(new Pisica("Tom", 3));
        pisici.add(new Pisica("Leo", 1));
        pisici.add(new Pisica("Kity", 2));
        pisici.add(new Pisica("Mitzy", 4));
        
        pisici.forEach(System.out::println);
    }
}