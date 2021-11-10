package tut4;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        boolean prime = true;
        if (n < 2) {
            prime = false;
        } else {
            for (int i = 2; i < n / 2; i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }
        }
        if (prime) {
            System.out.println("It is a prime number.");
        } else {
            System.out.println("It is not a prime number.");
        }
    }
}
