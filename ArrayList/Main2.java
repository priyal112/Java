package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Monday, Tuesday");
        System.err.println(list.getClass().getName());

        String[] array = {"Apple", "Mange", "Banana"};
        List<String> list2 = Arrays.asList(array);
        System.out.println(list2.getClass().getName());


        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Orange");

        fruits.remove("Apple");  // remove object
        System.out.println(fruits);

        List<Integer> list3 = new ArrayList<>();
        list3.add(3);
        list3.add(2);
        list3.add(1);

        list3.remove(Integer.valueOf(1));  // remove object
        System.out.println(list3);
    }
}
