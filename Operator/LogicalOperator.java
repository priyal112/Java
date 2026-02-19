package Operator;

public class LogicalOperator {
    public static void main(String[] args) {
        int ramMarks = 35;
        int ramAge = 45;
        System.out.println(ramMarks >= 33 && ramAge <= 18);  // AND LOGICAL OPERATOR

        //String name = "Sita";
        int exp = 2;
        boolean tier1 = true;
        boolean cond1 = exp >= 5;
        System.out.println(tier1 || cond1);    // logical OR
    }
}
