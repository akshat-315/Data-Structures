import java.util.ArrayList;
import java.util.Collections;

import org.w3c.dom.Node;

public class Sort_LL {

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
     * Node(int data)
     * {
     * this.data = data;
     * this.next = null;
     * }
     * Node(int data, Node next)
     * {
     * this.data = data;
     * this.next = next;
     * }
     * }
     * 
     *****************************************************************/

    public static Node sortList(Node head) {
        ArrayList<Integer> arr = new ArrayList<>();
        Node temp = head;

        while (temp != null) {
            arr.add(temp.data);
            temp = temp.next;
        }

        Collections.sort(arr);

        Node dummy = new Node();
        dummy.next = head;

        for (int i = 0; i < arr.size(); i++) {
            head.data = arr.get(i);
            head = head.next;
        }

        return dummy.next;
    }
}
