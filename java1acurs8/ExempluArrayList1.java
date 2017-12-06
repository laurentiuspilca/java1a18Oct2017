import java.util.*;

public class ExempluArrayList1 {

    public static void main(String [] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(5);
        list.add(1);
        list.add(6);
        list.add(7);
        
        for (int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}