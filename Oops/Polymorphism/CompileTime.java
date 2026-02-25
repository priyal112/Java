package Oops.Polymorphism;

class Calculator {
    public int add(int a, int b){
        return a + b;   // Method OverLoading
    }

    public int add(int a, int b, int c){
        return a + b + c;
    }

    public double add(double a, double b){
        return a + b;
    }
}

public class CompileTime{
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(3, 6));
        System.out.println(calc.add(3, 7, 4));
        System.out.println(calc.add(4.5, 6.3));
    }
}
