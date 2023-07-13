package Arrays;

public class linear_search {

    public static int linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int key = 5;
        int index = linearSearch(arr, key);
        if (index == -1) {
            System.out.print("Key not found");
        } else {
            System.out.print("Key is at : " + index);
        }

    }

}