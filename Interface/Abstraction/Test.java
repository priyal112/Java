package Interface.Abstraction;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.eat();

        System.out.println(Dog.Max_age);
        System.out.println(Animal.Max_age);

        Animal.info();

        dog.run();
        cat.run();

    }
}
