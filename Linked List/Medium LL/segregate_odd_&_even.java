
/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }

 *****************************************************************/
import java.util.*;

public class Solution {
    public static Node segregateEvenOdd(Node head) {
        ArrayList<Integer> Even = new ArrayList<>();
        ArrayList<Integer> Odd = new ArrayList<>();

        Node temp = head;
        while (temp != null) {
            if (temp.data % 2 == 0)
                Even.add(temp.data);
            else
                Odd.add(temp.data);
            temp = temp.next;
        }

        Node temp2 = head;
        for (int i = 0; i < Even.size(); i++) {
            temp2.data = Even.get(i);
            temp2 = temp2.next;
        }

        for (int i = 0; i < Odd.size(); i++) {
            temp2.data = Odd.get(i);
            temp2 = temp2.next;
        }
        return head;
    }
}