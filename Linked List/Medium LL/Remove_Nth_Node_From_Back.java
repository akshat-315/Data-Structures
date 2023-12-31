import org.w3c.dom.Node;

public class Remove_Nth_Node_From_Back {

    /****************************************************************
     * 
     * Following is the class structure of the Node class:
     * 
     * class Node {
     * public int data;
     * public Node next;
     * public Node prev;
     * 
     * Node()
     * {
     * this.data = 0;
     * this.next = null;
     * this.prev = null;
     * }
     * 
     * Node(int data)
     * {
     * this.data = data;
     * this.next = null;
     * this.prev = null;
     * }
     * 
     * Node(int data, Node next)
     * {
     * this.data = data;
     * this.next = next;
     * this.prev = next;
     * }
     * };
     * 
     *****************************************************************/

    public static Node removeKthNode(Node head, int K) {
        Node start = new Node();
        start.next = head;
        Node fast = start;
        Node slow = start;

        for (int i = 1; i <= K; ++i)
            fast = fast.next;

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return start.next;
    }
}
