package tut4;

public class CheckPower2B {
    // 24 12 6 3
    // 32 16 8 4 2 1
    public static boolean isPower2(int n) {
        if (n < 1) return false;
        while (n % 2 == 0) {
            n /= 2;
        }
        return (n == 1);
    }

    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++) {
            if (isPower2(i)) {
                System.out.println(i);
            }
        }
    }
}
