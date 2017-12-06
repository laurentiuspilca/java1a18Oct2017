import java.util.*;

public class ExempluLinkedList {

    public static void main(String [] args) {
        LinkedList<Integer> list = new LinkedList<>();
        
        list.addFirst(50);
        list.addFirst(60);
        list.addLast(89);
        list.removeFirst();
        list.addFirst(45);
        list.addLast(98);
        list.addLast(55);
        list.removeFirst();
        list.removeLast();
        list.addFirst(88);
        list.addFirst(69);
        list.addLast(78);
        list.removeFirst();
        list.addFirst(75);
        
        list.forEach(System.out::println);
    }
}