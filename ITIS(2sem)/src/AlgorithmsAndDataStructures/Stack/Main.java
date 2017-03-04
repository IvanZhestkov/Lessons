package AlgorithmsAndDataStructures.Stack;

import java.util.Scanner;

/**
 * Created by User on 13.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String s = sc.nextLine();
        //System.out.println(isValid(s));
        Stack stack = new ArrayStackMin();
        stack.push(1);
        stack.push(2);
        stack.push(-1);
        stack.push(4);
        stack.push(3);
        stack.push(-5);
        stack.push(0);

        stack.pop();
        stack.pop();

        System.out.println(stack.top());
        System.out.println(stack.min());
    }

    public static boolean isValid(String s) {
        char[] str = s.toCharArray();
        Stack stack = new ArrayStack(str.length);
        char check;
        for (char c : str) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else {
                if (!stack.isEmpty()) {
                    check = (char) stack.pop();
                    if (c == '}' && check !=  '{') {
                        return false;
                    } else if (c == ']' && check != '[') {
                        return false;
                    } else if (c == ')' && check != '(') {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
