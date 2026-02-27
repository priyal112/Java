package Interface.Multiple_Inhertance;

public class Smartphone implements Camera, Musicplayer, Phone{

    @Override
    public void makeCall(String number) {
        System.out.println("Calling 27485648566 from smartphone");
    }

    @Override
    public void endCall() {
       System.out.println("End call");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music");
    }

    @Override
    public void stopMusic() {
        System.out.println("Stopping music");
    }

    @Override
    public void takePhoto() {
        System.out.println("taking photo with smartphone");
    }

    @Override
    public void recordVideo() {
        System.out.println("reocrding the video");
    }
    
    
}
