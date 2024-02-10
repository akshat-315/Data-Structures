package Arrays.Easy;


public class pairs_in_array {

    public static void Pairs(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            for (int j = i; j < arr.length; j++) {
                System.out.print("(" + curr + "," + arr[j] + ")");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Pairs(arr);
    }

}
