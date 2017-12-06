import java.util.*;

public class ExempluLinkedHashSet {

    public static void main(String [] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        
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