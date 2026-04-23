package Map_demo;

import java.util.WeakHashMap;

public class WeakhashMap {
    public static void main(String[] args) {
        WeakHashMap<String, Image> imageCache = new WeakHashMap<>();
        imageCache.put("img1", new Image("Image 1"));
        imageCache.put("img2", new Image("Image 2"));
        System.out.println(imageCache);
        System.gc();
        simulateApplicationRunning();
        System.out.println("Cache after running (some entries my be cleared): " + imageCache);
    }

    private static void simulateApplicationRunning() {
        try {
            System.out.println("Simulating application running");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
             //e.printStackTrace();
        }
    }

}

class Image {
    private String name;

    public Image(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "[name=" + name + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}