package tut5;

public class Ex1 {
    public static String toBinary(int n) {
        // mod 2, divide by 2
        String s = "";
        if (n == 0) s = "0";
        // non-negative only
        if (n < 0) s = "NaN";
        while (n > 0) {
            s = (n % 2) + s;
            n /= 2;
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(toBinary(999999999));
    }
}
