package Arrays.Easy;


public class binary_search {

    public static int binarySearch(int arr[], int key) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int key = 8;
        int index = binarySearch(arr, key);
        if (index == -1) {
            System.out.print("Key not found");
        } else {
            System.out.print("Key is at : " + index);
        }

    }
}
