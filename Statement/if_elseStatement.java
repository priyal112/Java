package Statement;

public class if_elseStatement {
    public static void main(String[] args) {
        int age = 20;
        if(age >= 18){
            System.out.println("You are adult");
        }
        else{
            System.out.println("You are child");
        }

        int marks = 35;
        int age1 = 20;
        if(age1 <= 18 && marks <= 33){
            System.out.println("Pass");
        }
        else{
            System.out.println("Better luck next time");
        }
    }
}
