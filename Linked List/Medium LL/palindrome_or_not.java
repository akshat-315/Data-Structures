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
 * }
 * 
 *****************************************************************/

public class Solution {

    public static Node reverse(Node ptr) {
        Node next = null, prev = null;

        while (ptr != null) {
            next = ptr.next;
            ptr.next = prev;
            prev = ptr;
            ptr = next;
        }

        return prev;
    }

    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null)
            return true;

        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = reverse(slow.next);
        slow = slow.next;
        Node dummy = head;

        while (slow != null) {
            if (dummy.data != slow.data)
                return false;
            dummy = dummy.next;
            slow = slow.next;
        }
        return true;
    }
}