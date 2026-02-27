package Interface.Abstraction;

public interface Animal {
    
    int Max_age = 100;

    public abstract void eat();
    void sleep();

    public static void info(){     // static used
        System.out.println("This is an Animal interface.");

    }

    default void run(){     // default used
        this.eat();
        System.out.println("Animal is running.");
    }


}
