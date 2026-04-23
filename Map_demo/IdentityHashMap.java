package Map_demo;

//import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMap {
    public static void main(String[] args) {
        String key1 = "Key";
        String key2 = "Key";

        Map<String, Integer> map = new java.util.IdentityHashMap<>();
        map.put(key1, 1);
        map.put(key2, 2);
        System.out.println(key1.equals(key2));
        System.out.println(map);
    }
}
