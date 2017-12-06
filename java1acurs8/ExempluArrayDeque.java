import java.util.*;

public class ExempluArrayDeque {

    public static void main(String [] args) {
        ArrayDeque<Integer> a = new ArrayDeque<>();
        
        a.push(20);
        a.push(80);
        a.push(60);
        a.push(40);
        
        Integer v1 = a.pop();
        System.out.println(v1);
        
        Integer v2 = a.peek();
        System.out.println(v2);
        
        a.offer(50);
        
        a.forEach(System.out::println);
    }
}