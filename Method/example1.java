package Method;

public class example1 {
    public static void main(String[] args) {
        int[] a = {34, 55, 65, 44, 33};
        sumOfArray(a);

        int[] b = { 3, 6, 535, 636, 35};
        sumOfArray(b);

        String res = upperfun("     priyal   ");
        System.out.println(res); 
    }

    public static void sumOfArray(int[] arr){
        int res = 0;
        for(int i : arr){
            res += i;
        }
    System.out.println(res);
    }

    private static String upperfun(String str){
        return str.trim().toUpperCase();
    }
    
}

