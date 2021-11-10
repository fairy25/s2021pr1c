package tut4;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt(); // n = 0
        int saved = n;
        int reverse = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            reverse = (reverse * 10) + lastDigit;
            n = n / 10;
        }
        System.out.println(n);
        if (reverse == saved) {
            System.out.println("It is a palindrome number.");
        } else {
            System.out.println("It isn't a palindrome number.");
        }
    }
}


