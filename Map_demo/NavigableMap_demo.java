package Map_demo;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMap_demo {
  public static void main(String[] args) {
    NavigableMap<Integer, String> navigableMap = new TreeMap<>();
    navigableMap.put(1, "ONE");
    navigableMap.put(5, "FIVE");
    navigableMap.put(3, "THREE");

    System.out.println(navigableMap);
    System.out.println(navigableMap.lowerKey(4));
    System.out.println(navigableMap.ceilingKey(3));
    


      
  }
}
