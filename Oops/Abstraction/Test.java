package Oops.Abstraction;

public class Test {
    
    public static void main(String[] args) {
        Animal bob = new Dog();
        bob.sayHello();

        Cat cat = new Cat();
        cat.sayHello();
        
    }
}
