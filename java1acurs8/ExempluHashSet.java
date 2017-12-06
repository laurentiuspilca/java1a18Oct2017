import java.util.*;

public class ExempluHashSet {

    public static void main(String [] args) {
        HashSet<Integer> set = new HashSet<>();
        
        set.add(50);
        set.add(90);
        set.add(56);
        set.add(85);
        set.add(50);
        set.add(54);
        set.add(100);
        
        set.forEach(System.out::println);
    }
}