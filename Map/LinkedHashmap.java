package Map;
import java.util.Map;
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
    }


}
