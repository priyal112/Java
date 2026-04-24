
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashmap_demo {
  public static void main(String[] args){
    ConcurrentHashMap< String, Integer> map = new ConcurrentHashMap<>();
    map.put("Apple", 23);
    System.out.println(map);

  }
}
