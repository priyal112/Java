package Operator;
public class Increment_Decrement_Operator {
    public static void main(String[] args) {
        int a = 1;

        System.out.println(a + a++);
        System.out.println(a + ++a);
        System.out.println(a++ + a);
        System.out.println(++a + a);
        System.out.println(a++ + --a);
    }
}
