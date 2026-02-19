package Loop;

public class breakInLoop {
    public static void main(String[] args) {
        int i = 0;
        while( i < 1000){
            System.out.println(i);
            if (i == 500){
                break;
            }
            i++;
        }
        System.out.println("Hello!");
    }
}
