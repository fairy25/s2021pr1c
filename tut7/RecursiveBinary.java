package tut7;

public class RecursiveBinary {
    public static void printBinary(int n) {
        // base cases
        if (n == 0) {
            System.out.print("0");
        } else if (n == 1) {
            System.out.print("1");
        } else {
            printBinary(n / 2);
            System.out.print(n % 2);
        }
    }

    public static String toBinary(int n) {
        if (n == 0) {
            return "0";
        } else if (n == 1) {
            return "1";
        } else {
            return toBinary(n / 2) + (n % 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(toBinary(0));
        System.out.println(toBinary(1));
        System.out.println(toBinary(2));
        System.out.println(toBinary(3));
        System.out.println(toBinary(4));
        System.out.println(toBinary(453));
        System.out.println(toBinary(20013));
    }
}