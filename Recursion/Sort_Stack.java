package Recursion;

import java.util.Stack;

public class Sort_Stack {
    public static Stack<Integer> sort(Stack<Integer> s, int e) {
        if (s.isEmpty() || (!s.isEmpty() && s.peek() < e)) {
            s.push(e);
            return s;
        }

        int x = s.peek();
        s.pop();

        sort(s, e);
        s.push(x);
        return s;
    }

    public static Stack<Integer> sortStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return s;
        }

        int x = s.peek();
        s.pop();
        sortStack(s);

        sort(s, x);
        return s;
    }
}
