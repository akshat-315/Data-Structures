import org.w3c.dom.Node;

public class Detect_A_Loop {
    public static boolean detectCycle(Node head) {
        if (head.next == head)
            return true;
        else {
            Node slow = head, fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;

                if (slow == fast)
                    return true;
            }
        }
        return false;
    }
}
