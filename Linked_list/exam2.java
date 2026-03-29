package Linked_list;

import java.util.Arrays;
import java.util.LinkedList;

public class exam2 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedlist = new LinkedList<>();
        linkedlist.add(1);
        linkedlist.add(2);
        linkedlist.add(3);
        linkedlist.add(4);
        linkedlist.get(2);  //o(n)
        linkedlist.addFirst(4); //O(1)
        linkedlist.addLast(0);  //O(1)

        System.out.println(linkedlist);
        
        
        LinkedList<String> animals = new LinkedList<>(Arrays.asList("Cat", "Dog", "Elephant"));
        LinkedList<String> animalsToRemove = new LinkedList<>(Arrays.asList("Dog", "Ele"));
        animals.removeAll(animalsToRemove);
        System.out.println(animals);
    }
}
