package tut2;

public class LargestOfThree {
    public static void main(String[] args) {
        int a = 3, b = 6, c = 2;
        System.out.print("Among " + a + ", " + b + " and " + c + ", the largest is ");
        if (a > b && a > c) {
            System.out.print(a);
        } else if (b > c) {
            System.out.print(b);
        } else {
            System.out.print(c);
        }
        System.out.println(".");
    }
}
