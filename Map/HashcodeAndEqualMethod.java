package Map;

import java.util.HashMap;
import java.util.Objects;

public class HashcodeAndEqualMethod {
    public static void main(String[] args) {
        HashMap<Person, String> map = new HashMap<>();
        Person p1 = new Person("Alice", 2);
        Person p2 = new Person("Pri", 2);
        Person p3 = new Person("Alice", 1);

        map.put(p1, "Engineer");
        map.put(p2, "Designer");
        map.put(p3, "Manager");

        System.out.println("Hashmap size: " + map.size());
        System.out.println("Value of p1: " + map.get(p1));
        System.out.println("Value of p3: " + map.get(p3));
    }
}

class Person{
   private String name;

   private int id;

   public Person(String name, int id){
       this.name = name;
       this.id = id;
   }

   public String getName() {
    return name;
   }

   public int getId() {
    return id;
   }

   @Override
   public int hashCode() {
    return Objects.hash(name, id);
   }

   @Override
   public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Person other = (Person) obj;
    return id == other.getId() && Objects.equals(name, other.getName());
   }

   @Override
   public String toString() {
    return "name=" + name + ", id=" + id;
   }


   
}
