package Loop;

public class nestedLoop {
    public static void main(String[] args) {
        // star print
        for( int i = 0; i < 6; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
