package Strings.Easy;

public class Rotate_String {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length())
            return false;

        return ((s + s).contains(goal));
    }
}
