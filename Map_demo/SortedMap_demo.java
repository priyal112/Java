package Map_demo;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMap_demo {
  public static void main(String[] args) {
    SortedMap<Integer, String> map = new TreeMap<>();
    map.put(91, "Alex");
    map.put(99, "Shubham");
    map.put(78, "Raj");
    map.put(77, "Vipul");
    System.out.println(map);
    map.get(77);
    map.containsKey(99);

    System.out.println(map.firstKey());
    System.out.println(map.lastKey());
    //System.out.println(map.headMap(91));         if integer is key
    //System.out.println(map.tailMap(91));
  }
  
}
