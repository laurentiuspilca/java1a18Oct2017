import java.util.*;

public class ExempluArrayList2 {

    public static void main(String [] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(5);
        list.add(1);
        list.add(6);
        list.add(7);
        
        for (Integer x : list) {
            System.out.println(x);
        }
    }
}