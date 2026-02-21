package Oops;

public class CarTest {
    public static void main(String[] args) {
        CarClass car = new CarClass();
        car.color = "Blue";
        car.speed = 40;
        car.brand = "Tata";
        car.year = 2025;
        car.model = "Safari";

        car.accelerate(1);
        System.out.println(car.speed);

    }
}
