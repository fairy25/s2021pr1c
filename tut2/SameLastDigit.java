package tut2;

public class SameLastDigit {
    public static void main(String[] args) {
        int x1 = 28, x2 = 56;
        int d1 = x1 % 10;
        int d2 = x2 % 10;
        if (d1 == d2) {
            System.out.println("Two numbers " + x1 + " and " + x2 + " have the same last digit.");
        } else {
            System.out.println("Two numbers " + x1 + " and " + x2 + " have different last digit.");
        }
    }
}
