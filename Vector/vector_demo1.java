package Vector;

import java.util.LinkedList;
import java.util.Vector;

public class vector_demo1 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        Vector<Integer> vector = new Vector<>(linkedList);
        System.out.println(vector);
    }
}
