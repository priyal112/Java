package Inner_classes.Static_inner_class;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer("HP", "ABC", "XYZ");
        computer.getOs().displayinfo();

        //Computer.USB usb = new Computer.USB("TYPE-C");
    }
}
