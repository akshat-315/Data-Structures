import java.util.*;

public class now {
    static class Mythreads extends Thread {
        public void run() {
            int i = 1;
            while (true) {
                System.out.print(i + " Hello");
                i++;
            }
        }
    }

    public static void main(String args[]) {
        Mythreads t = new Mythreads();
        t.start();
        int i = 1;
        while (true) {
            System.out.print(i + " World");
            i++;
        }
    }
}
