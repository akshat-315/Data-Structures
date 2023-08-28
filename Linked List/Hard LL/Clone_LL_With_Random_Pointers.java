package Linked List.Hard LL;

public class Clone_LL_With_Random_Pointers {

    /****************************************************************
     * 
     * Following is the class structure of the Node class:
     * 
     * class Node {
     * public int data;
     * public Node next;
     * public Node random;
     * 
     * Node()
     * {
     * this.data = 0;
     * this.next = null;
     * this.random = null;
     * }
     * Node(int data)
     * {
     * this.data = data;
     * this.next = null;
     * this.random = null;
     * }
     * Node(int data, Node next, Node random)
     * {
     * this.data = data;
     * this.next = next;
     * this.random = random;
     * }
     * }
     * 
     *****************************************************************/

    public static Node cloneLL(Node head) {
        Node temp = head;

        while (temp != null) {
            Node newNode = new Node(temp.data);
            newNode.next = temp.next;
            temp.next = newNode;
            temp = temp.next.next;
        }

        Node itr = head;
        while (itr != null) {
            if (itr.random != null) {
                itr.next.random = itr.random;
            }
            itr = itr.next.next;
        }

        Node dummy = new Node(0);
        itr = head;
        temp = dummy;
        Node fast;

        while (itr != null) {
            fast = itr.next.next;
            temp.next = itr.next;
            itr.next = fast;
            itr = itr.next;
            temp = temp.next;
        }
        return dummy.next;
    }
}
