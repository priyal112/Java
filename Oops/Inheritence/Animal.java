package Oops.Inheritence;

public class Animal {
    String name;
    int age;

    // getter/ setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // constructor

    public void eat(){
        System.out.println("This animal eats food.");
    }
    
    public void sayHello(){
        System.err.println();
    }
    
}
