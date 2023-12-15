package CustomStacks;

import java.util.Stack;

public class InbuiltStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(18);
        stack.push(89);
        stack.push(98);

        System.out.println(stack.pop());

    }
}
