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

public class Solution {

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

    public static int lengthOfLoop(Node head) {
        Node ptr = cycleDetected(head);

        if (ptr == null)
            return 0;
        else {
            Node start = head;
            while (start != ptr) {
                ptr = ptr.next;
                start = start.next;
            }
            int length = 1;
            Node count = start.next;
            while (count != start) {
                length++;
                count = count.next;
            }
            return length;
        }
    }
}