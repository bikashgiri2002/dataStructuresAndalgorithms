package stack;

import java.util.Stack;

public class StackBasic {
    public static void main(String[] args) {
        Stack<Integer> sk = new Stack<>();
        sk.push(10);
        sk.push(20);
        System.out.println(sk);
    }
}
