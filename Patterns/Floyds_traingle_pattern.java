public class Floyds_traingle_pattern {

    public static void Floyds_traingle(int n) {
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Floyds_traingle(5);
    }

}
