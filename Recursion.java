public class Recursion {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(sumOfNaturalNo(5));
    }
    
    // factorial
    public static int factorial(int n) {
        if(n == 1){
            return 1;
        }
        return n * factorial(n - 1);
    }


    // sum of natural numbers
    public static int sumOfNaturalNo(int n){
        if(n == 1){
            return 1;
        }
        return n + sumOfNaturalNo(n - 1);
    }
}
