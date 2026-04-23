package Map_demo;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;


public class LinkedHashmap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Orange", 22);
        linkedHashMap.put("Mango", 12);
        linkedHashMap.put("Apple", 45);

        for(Map.Entry<String, Integer> entry : linkedHashMap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        HashMap<String, Integer> hashMap = new HashMap<>();
        //LinkedHashmap linkedHashMap1 = new LinkedHashmap(hashMap);

        hashMap.put("Shubham", 91);
        hashMap.put("Bob", 89);
        hashMap.put("Akshat", 41);

        Integer res = hashMap.getOrDefault("Vipul", 0);
        System.out.println(res);
        hashMap.putIfAbsent("Shubham", 92);
        System.out.println(hashMap);
    }


}
