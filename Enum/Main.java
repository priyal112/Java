package Enum;

public class Main {
    public static void main(String[] args) {
        Day monday = Day.MONDAY;
        int ordinal = monday.ordinal();
        System.out.println(ordinal);
        System.out.println(monday.name());

        monday.disply();
    }
}
