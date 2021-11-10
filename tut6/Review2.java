package tut6;

public class Review2 {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                int n = i * j;
                if (n < 10) {
                    System.out.print("   " + n);
                } else if (n < 100) {
                    System.out.print("  " + n);
                } else {
                    System.out.print(" " + n);
                }
            }
            System.out.println();
        }
    }
}
