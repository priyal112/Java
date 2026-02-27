package Interface.Multiple_Inhertance;

public class Test {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();

        smartphone.makeCall("6789754325");
        smartphone.endCall();
        smartphone.playMusic();
        smartphone.stopMusic();
        smartphone.recordVideo();
        smartphone.takePhoto();
    }
}
 