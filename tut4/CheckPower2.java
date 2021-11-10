package tut4;

public class CheckPower2 {
    public static void main(String[] args) {
        // 17 -> 8 -> 4 -> 2 (integer division)
        // 17 -> 8.5 -> 4.25 -> 2.125 - > 1.0625 -> 0.5xxx (float division)
        // 16 -> 8 -> 4 -> 2
        for (int x = 1; x < 100; x++) {
            double a = x;
            while (a > 1) {
                if (a == 2) {
                    System.out.println(x + " is a power of 2");
                    break;
                }
                a = a / 2;
            }
        }
    }
}
