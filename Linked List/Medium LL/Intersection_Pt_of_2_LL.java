import org.w3c.dom.Node;

public class Intersection_Pt_of_2_LL {
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

    public static int findIntersection(Node firstHead, Node secondHead) {
        Node d1 = firstHead, d2 = secondHead;

        while (d1 != d2) {
            d1 = d1 == null ? secondHead : d1.next;
            d2 = d2 == null ? firstHead : d2.next;
        }

        return d1.data;
    }
}
