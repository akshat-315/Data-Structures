package Stacks_and_Queues;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Asteroid_Collision {
    public static List<Integer> collidingAsteroids(int[] asteroids) {
        List<Integer> ans = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        int n = asteroids.length;

        for (int i = 0; i < n; i++) {
            int a = asteroids[i];

            if (a > 0)
                st.push(a);
            else {
                while (!st.isEmpty() && st.peek() > 0 && st.peek() < Math.abs(a)) {
                    st.pop();
                }

                if (st.isEmpty() || st.peek() < 0 || st.peek() < Math.abs(a))
                    st.push(a);
                else if (st.peek() == Math.abs(a))
                    st.pop();
            }
        }
        while (!st.isEmpty()) {
            ans.add(0, st.peek());
            st.pop();

        }
        return ans;
    }
}
