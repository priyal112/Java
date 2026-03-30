package ArrayList;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArraylist {
    public static void main(String[] args) {
        List<String> shoppingList = new CopyOnWriteArrayList<>();
        shoppingList.add("Milk");
        shoppingList.add("Eggs");
        shoppingList.add("Bread");
        System.out.println("Initial shooping list: " + shoppingList);

        for(String item: shoppingList){
            //try to modify the list while reading
            if (item.equals("Eggs")){
                shoppingList.add("Butter");
                System.out.println("Added butter");
            }
        }
        System.out.println("Updated list: " + shoppingList);
    }
}
