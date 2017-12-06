import java.util.*;

public class ExempluHashMap1 { 

    public static void main(String [] args) {
        HashMap<Integer, String> map = new HashMap<>();
        
        map.put(4, "HELLO");
        map.put(6, "WORLD");
        map.put(4, "AGAIN");
        
        Set<Integer> keys = map.keySet();
        
        for (Integer k : keys) {
            System.out.println(map.get(k));
        }
    }
}