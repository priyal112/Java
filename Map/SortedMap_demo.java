package Map;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMap_demo {
  public static void main(String[] args) {
    SortedMap<String, Integer> map = TreeMap<>();
    map.put("Alex", 98);
    map.put("Shubham", 80);
    map.put("Raj", 78);
    System.out.println(map);
  }
  
}
