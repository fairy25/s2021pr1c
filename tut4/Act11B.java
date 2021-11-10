package tut4;

public class Act11B {
    public static void main(String[] args) {
        int step = 2;
        for (int k = 1; k > 0; k += step) {
            for (int i = 0; i < k; i++) {
                System.out.print("*");
            }
            System.out.println();
            if (k == 9) step = -step;
        }
    }
}
