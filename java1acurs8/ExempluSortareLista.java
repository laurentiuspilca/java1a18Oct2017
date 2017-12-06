import java.util.*;

public class ExempluSortareLista {

    public static void main(String [] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(40);
        list.add(50);
        list.add(10);
        
        Collections.sort(list);
        
        list.forEach(System.out::println);
    }
}