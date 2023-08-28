public class Sort_0_1_&_2
{

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
    public static Node sortList(Node head) {
        int countOne = 0, countTwo = 0, countZero = 0;
        Node temp = head;

        while (temp != null) {
            if (temp.data == 0)
                countZero++;
            else if (temp.data == 1)
                countOne++;
            else if (temp.data == 2)
                countTwo++;
            temp = temp.next;
        }

        temp = head;
        while (temp != null) {
            if (countZero != 0) {
                temp.data = 0;
                countZero--;
            } else if (countOne != 0) {
                temp.data = 1;
                countOne--;
            } else if (countTwo != 0) {
                temp.data = 2;
                countTwo--;
            }
            temp = temp.next;
        }

        return head;
    }
}
