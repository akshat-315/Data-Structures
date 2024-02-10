public class Add_2_Numbers {

    /****************************************************************
     * 
     * Following is the class structure of the Node class:
     * 
     * class LinkedListNode {
     * int data;
     * LinkedListNode next;
     * 
     * public LinkedListNode(int data) {
     * this.data = data;
     * }
     * }
     * 
     *****************************************************************/

    static LinkedListNode addTwoNumbers(LinkedListNode l1, LinkedListNode l2) {
        LinkedListNode dummy = new LinkedListNode(0);
        LinkedListNode temp = dummy;
        int carry = 0;
        while (l1 != null || l2 != null || carry == 1) {
            int sum = 0;
            if (l1 != null) {
                sum += l1.data;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.data;
                l2 = l2.next;
            }

            sum += carry;
            carry = sum / 10;
            LinkedListNode node = new LinkedListNode(sum % 10);
            temp.next = node;
            temp = temp.next;
        }
        return dummy.next;
    }
}
