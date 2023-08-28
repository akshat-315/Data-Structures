import org.w3c.dom.Node;

public class Find_Starting_Point_Of_LL {
    public static Node cycleDetected(Node head) {
        Node slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
                return slow;
        }
        return null;
    }

    public static Node firstNode(Node head) {
        Node ptr = cycleDetected(head);

        if (ptr == null)
            return null;
        else {
            Node start = head;
            while (start != ptr) {
                ptr = ptr.next;
                start = start.next;
            }
            return start;
        }

    }
}
