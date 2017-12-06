import java.util.*;

public class ExempluHashMap2 { 

    public static void main(String [] args) {
        HashMap<Integer, String> map = new HashMap<>();
        
        map.put(4, "HELLO");
        map.put(6, "WORLD");
        map.put(4, "AGAIN");
        
        map.forEach((k,v) -> System.out.println(k + " " + v));
    }
}