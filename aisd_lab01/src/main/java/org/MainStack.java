package org;

import java.util.Stack;

public class MainStack {
    public static void main(String[] args) {
        char[] array = {'(', '[', '{', '}', ']', ')'};
        Stack<Character> stack = new Stack<>();
        for (char x : array) {
            if (x == '(' || x == '[' || x == '{') {
                stack.push(x);
            } else {
                if (stack.isEmpty()) {
                    System.out.println("Ошибка ");
                    System.exit(-1);
                }
                char top = stack.pop();
                if (!((x == ')' && top == '(') ||
                        (x == ']' && top == '[') ||
                        (x == '}' && top == '{'))) {
                    System.out.println("Ошибка");
                    System.exit(-2);
                }


            }

        }
        System.out.println(stack.isEmpty());

    }
}
