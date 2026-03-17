package Map;

import java.util.HashMap;

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

    }
}
