package tut6;

public class Act1 {
    public static void main(String[] args) {
        int n = 256;
        int factor = 2;
        while (n > 1) {
            if (n % factor == 0) {
                System.out.print(factor + " ");
                n /= factor;
            } else {
                factor++;
            }
        }
    }
}
