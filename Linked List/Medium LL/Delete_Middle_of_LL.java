import org.w3c.dom.Node;

public class Delete_Middle_of_LL {
    /****************************************************************
     * 
     * Following is the class structure of the Node class:
     * 
     * class Node {
     * public int data;
     * public Node next;
     * 
     * Node()
     * {
     * this.data = 0;
     * this.next = null;
     * }
     * 
     * Node(int data)
     * {
     * this.data = data;
     * this.next = null;
     * }
     * 
     * Node(int data, Node next)
     * {
     * this.data = data;
     * this.next = next;
     * }
     * };
     * 
     *****************************************************************/

    public static Node deleteMiddle(Node head) {
        if (head.next == null || head == null) {
            head = null;
            return head;
        }

        Node slow = head, fast = head, prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = slow.next;
        slow.next = null;
        return head;
    }
}
