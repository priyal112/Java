package Loop;

public class Practice {
    public static void main(String[] args) {
        
        // sum of natural no
        int sum = 0;
        int i = 1;
        while(i <= 10){
            sum = sum + i;
            i++;
        }
        System.out.println(sum);

        // COUNTS DIGIT OF NUMBER
        int n = 675438965;
        int res = 0;
        while(n > 0){
            n = n / 10;
            res++;
        }
        System.out.println(res);

        // factorial of a number
        int n1 = 6;
        int res1 = 1;
        while (n1 > 0) {
            res1 = res1 * n1;
            n1--;
        }
        System.out.println(res1);
    }
}
