package Method;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(sum(6, 7));

        System.out.println(sum(34, 5, 3));
    }

    private static int sum(int a, int b){
        return a + b;
    }

    private static int sum(int a, int b, int c){
        return a + b;
    }
}
