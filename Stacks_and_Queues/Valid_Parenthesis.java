package Stacks_and_Queues;

import java.util.HashMap;
import java.util.Stack;

public class Valid_Parenthesis {
    public static boolean isValidParenthesis(String s) {
        Stack<Character> stk = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();

        map.put('}', '{');
        map.put(')', '(');
        map.put(']', '[');

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '{' || ch == '[' || ch == '(') {
                stk.push(ch);
            } else {
                if (!stk.isEmpty() && map.get(ch) == stk.peek()) {
                    stk.pop();
                } else {
                    return false;
                }
            }
        }
        return true;

    }
}
