package tut6;

public class Review2B {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            // start line
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
            // end line
            System.out.println();
        }
    }
}
