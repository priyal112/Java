package ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(6);
        System.out.println(list.get(2));
        System.out.println(list.size());

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        

        list.remove(2);
        for( int x : list){
            System.out.println(x);
        }

        list.add(2, 34);
        for( int y : list){
            System.out.println(y);
        }

        list.set(1, 45);
        System.out.println(list);
        
        
    }
}
