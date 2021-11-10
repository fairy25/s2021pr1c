package tut4;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Factorial is not defined for " + n);
        } else {
            // n >= 0
            System.out.print("Factorial of " + n + " is ");
            int fact = 1; // n! = 1 * 2 * ... * n
            for (int i = 0; i < n; i++) {
                // i = 0, 1... (n-1)
                // (i + 1) = 1, 2... n
                fact = fact * (i + 1);
            }
            System.out.println(fact);
        }
    }
}
