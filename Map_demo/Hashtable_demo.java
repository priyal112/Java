import java.util.Hashtable;

public class Hashtable_demo {
  public static void main(String[] args){
    Hashtable<Integer, String> hashtable = new Hashtable<>();
    hashtable.put(1, "Apple");
    hashtable.put(2, "Banana");
    hashtable.put(3, "Cherry");

    System.out.println(hashtable);
    System.out.println(hashtable.get(2));

  }
}