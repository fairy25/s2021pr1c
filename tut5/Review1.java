package tut5;

import java.util.Scanner;

public class Review1 {

    public static void a() {
        int sum = 0;
        for (int i = 2; i <= 100; i += 2) {
            sum += i;
        }
        System.out.println("Sum of even numbers between 2 and 100: " + sum);
    }

    public static void b() {
        for (int i = 1; i * i <= 100; i++) {
            System.out.print((i * i) + " ");
        }
        System.out.println();
    }

    public static void c() {
        for (int i = 2; i <= 220; i *= 2) {
            if (i >= 20) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void d() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 integers (separated by space): ");
        int a = sc.nextInt(), b = sc.nextInt();
        int sum = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        System.out.println("Sum of odd numbers between " + a + " and " + b + " is: " + sum);
    }

    public static void e() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int sum = 0;
        for (int n = sc.nextInt(); n > 0; n /= 10) {
            int d = n % 10; // right-most digit
            if (d % 2 == 1) {
                sum += d;
            }
        }
        System.out.println("Sum of its odd digits is " + sum + ".");
    }

    public static void main(String[] args) {
        System.out.println("Part A:");
        a();
        System.out.println("Part B:");
        b();
        System.out.println("Part C:");
        c();
        System.out.println("Part D:");
        d();
        System.out.println("Part E:");
        e();
    }
}
