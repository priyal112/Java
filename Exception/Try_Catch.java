package Exception;

public class Try_Catch {
    public static void main(String[] args) {
        int[] numerators = {10, 200, 30, 40};
        int[] demoninators = {1, 2,0,4};

        for(int i = 0; i < numerators.length; i++){
            System.out.println(divide(numerators[i], demoninators[i]));
        }
        System.out.println("Well done");
    }


    public static int divide(int a, int b){
        try{
            return a / b;
        }catch(ArithmeticException e){
            System.out.println("Arithematic exception:(");
            return -1;
        }catch(Exception e){
            System.out.println(e);
            return -1;
        }
    }
}
