package Linked List.Hard LL;

public class Rotatate_LL {

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

    public static Node rotate(Node head, int k) {
        int len = 1;
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
            len++;
        }

        k = k % len;
        if (k == 0 || head == null || head.next == null)
            return head;

        temp.next = head;

        k = (len - k) % len;

        while (k-- > 0)
            temp = temp.next;

        head = temp.next;
        temp.next = null;

        return head;
    }
}
