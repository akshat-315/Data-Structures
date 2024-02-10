package Binary Trees.Easy;

/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node left;
     public Node right;

     Node()
     {
         this.data = 0;
         this.left = null;
         this.right = null;
     }

     Node(int data)
     {
         this.data = data;
         this.left = null;
         this.right = null;
     }

     Node(int data, Node left, Node right)
     {
         this.data = data;
         this.left = left;
         this.right = right;
     }
 }

 *****************************************************************/

public class Create_Binary_Tree {
    public static Node create(int[] arr, int i){
        if(i >= arr.length) return null;

        Node newNode = new Node(arr[i]);
        newNode.left = create(arr, 2*i + 1);
        newNode.right = create(arr, 2*i + 2);

        return newNode;
    }

    public static Node createTree(int []arr){
        return create(arr, 0);
    }
}
