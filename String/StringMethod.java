package String;

public class StringMethod {
    public static void main(String[] args) {
        String name = "Priyal Shrivastava";
        int length = name.length();  // LENGTH
        System.out.println(name);
        System.out.println(length);

        char c = name.charAt(length - 1);  // CHARaT
        System.out.println(c);

        String name1 = "priyal shrivastava";
        System.out.println(name.equals(name1));   // EQUALS
        System.out.println(name.equalsIgnoreCase(name1));  

        String str1 = "remote";  // COMPAREtO
        String str2 = "ramote";
        int i = str1.compareTo(str2);
        System.out.println(i);

        String name2 = "    Amar Panchal  "; // TRIM
        System.out.println(name2.trim());

        String name3 = "Amar Panchal";      //SUBSTRING
        String subString = name3.substring(5 , 10);
        System.out.println(subString);

        String newName = name3.replace("Panchal", "Sharma");   // REPLACE
        System.out.println(newName);

        System.out.println(name3.contains("Pan"));  // CONTAINS
        System.out.println(name3.contains("am"));
        System.out.println(name3.contains("dde"));

        System.out.println(name3.startsWith("Am"));
        System.out.println(name3.endsWith("al"));

    
    }
}
