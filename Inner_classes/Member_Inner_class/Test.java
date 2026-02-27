package Inner_classes.Member_Inner_class;

public class Test {
    public static void main(String[] args) {
        Car car = new Car("Safari");
        Car.Engine engine = car.new Engine();
        engine.start();
        engine.stop();
    }
}
