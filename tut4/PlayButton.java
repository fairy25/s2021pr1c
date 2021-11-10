package tut4;

public class PlayButton {
    public static void main(String[] args) {
        int step = 2;
        int n = 1;
        while (n > 0) {
            for (int i = 0; i < n; i++) {
                System.out.print("* ");
            }
            System.out.println();
            n = n + step;
            if (n == 9) step = -step;
        }
    }
}
