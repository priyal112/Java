package String;

public class StringMethod1 {
    public static void main(String[] args) {
        String str1 = " ";
        System.out.println(str1.isBlank());

        System.out.println(str1.isEmpty());

        String name = "Amar";
        System.out.println(name.indexOf("A"));
        System.out.println(name.lastIndexOf("a"));

        String formatstr = String.format("I am %s and I am %d years old", "Priyal", 24);
        System.out.println(formatstr);

        int a = 23;
        String s = String.valueOf(a);
        System.out.println(s);
    }
    
}
