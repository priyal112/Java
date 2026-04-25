
import java.util.EnumMap;
import java.util.Map;

public class EnumMap_demo {
  public static void main(String[] args){
    Map<Day, String> map = new EnumMap<>(Day.class);
    map.put(Day.TUESDAY, "gym");
    map.put(Day.MONDAY, "walk");
    System.out.println(map);
  }
}

enum Day{
  MONDAY, TUESDAY, WEDNESDAY, THRUSDAY, FRIDAY, SATURDAY, SUNDAY
}