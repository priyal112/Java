package Operator;
public class BitwiseOperator {
    public static void main(String[] args) {
        // AND OPERATOR
        int a = 5 & 4;  
        System.out.println(Integer.toBinaryString(5));
        System.out.println(Integer.toBinaryString(4));
        System.out.println(a);
        System.out.println(Integer.toBinaryString(a));
        
        // OR OPERATOR
        int b = 3 | 5;
        System.out.println(b);

        // XOR OPERATOR
        int c = 8 ^ 3;
        System.out.println(c);

        // NOT OPERATOR
        int y = 5;
        int x = ~y;
        System.out.println(x);

        // LEFT SHIFT
        int z = y << 1;
        System.out.println(z);

        // RIGHT SHIFT
        int ab = y >> 2;
        System.out.println(ab);

    }
}
