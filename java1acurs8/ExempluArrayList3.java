import java.util.*;

public class ExempluArrayList3 {

    public static void main(String [] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(5);
        list.add(1);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(4);
        list.add(2);
        
        list.remove(new Integer(2));
        //list.forEach(e -> System.out.println(e));
        list.forEach(System.out::println);
    }
}