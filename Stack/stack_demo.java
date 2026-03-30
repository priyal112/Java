package Stack;

import java.util.Stack;

public class stack_demo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);

        Integer removedElement = stack.pop();
        System.out.println(stack);
        System.out.println(removedElement);

        Integer peek = stack.peek();
        System.out.println(stack);
        System.out.println(peek);
    }
}
