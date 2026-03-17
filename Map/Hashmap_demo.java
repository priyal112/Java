package Map;

import java.util.HashMap;
//import java.util.Map.Entry;
//import java.util.Set;

public class Hashmap_demo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Priyal");
        map.put(2, "Pri");
        map.put(3, "Priya");
        map.put(4, "Priyu");
        System.out.println(map);

        String student = map.get(3);
        System.out.println(student);

        String s = map.get(31);
        System.out.println(s);

        System.out.println(map.containsKey(4));
        System.out.println(map.containsValue("Pri"));

        //loop
        for(int i : map.keySet()){
            System.out.println(map.get(i));
        }

        //Set<Map.Entry<Integer, String>> entries = map.entrySet();

        //for (Map.Entry<Integer, String> entry : entries);
        //      entry.setValue(entry.getVaule().toUpperCase());       
    }
}
