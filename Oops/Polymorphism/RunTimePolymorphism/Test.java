package Oops.Polymorphism.RunTimePolymorphism;

public class Test {
    
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.sayHello();

        Animal dog = new Dog();  // overriding  // upcasting
        dog.sayHello();

        Animal cat = new Cat();
        cat.sayHello();
    }
}
