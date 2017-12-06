import java.util.*;

public class Graf1 {

    public static void main(String [] args) {
        HashMap<Integer, ArrayList<Integer>> graf = new HashMap<>();
        
        graf.put(1, new ArrayList<>());
        graf.get(1).add(2);
        graf.get(1).add(5);
        
        graf.put(2, new ArrayList<>());
        graf.get(2).add(3);
        
        graf.put(3, new ArrayList<>());
        graf.get(3).add(1);
        graf.get(3).add(4);
        graf.get(3).add(5);
    }
}