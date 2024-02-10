package Linked List.Hard LL;

public class Reverse_List_In_K_Groups {

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

    public static Node kReverse(Node head, int k) {
        if (head == null || head.next == null || k == 1)
            return head;

        int len = 0;
        Node length = head;
        while (length != null) {
            len++;
            length = length.next;
        }

        int groups = len / k;
        Node dummy = new Node(0);
        dummy.next = head;

        Node prev = dummy, curr = dummy, nex = dummy;

        while (len >= k) {
            curr = prev.next;
            nex = curr.next;

            for (int i = 1; i < k; i++) {
                curr.next = nex.next;
                nex.next = prev.next;
                prev.next = nex;
                nex = curr.next;
            }

            prev = curr;
            len -= k;
        }

        return dummy.next;
    }
}
