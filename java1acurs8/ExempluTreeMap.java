import java.util.*;

public class ExempluTreeMap {

    public static void main(String [] args) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        
        map.put(4, 7);
        map.put(8, 2);
        map.put(1, 6);
        map.put(3, 9);
        map.put(2, 8);
        
        map.forEach((a,b) -> System.out.println(a + " " + b));
    }
}