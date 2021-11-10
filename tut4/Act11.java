package tut4;

public class Act11 {
    public static void main(String[] args) {
        for (int k = 1; k <= 9; k += 2) {
            for (int i = 0; i < k; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int k = 7; k >= 1; k -= 2) {
            for (int i = 0; i < k; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    } // try to do this in 1 loop
}
