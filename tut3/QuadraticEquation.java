package tut3;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter 3 real numbers (a, b & c): ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("There's nothing to be solved.");
                } else {
                    System.out.println("The equation has no root.");
                }
            } else {
                double x = -c / b;
                System.out.println("There is one root: x = " + x);
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("The equation has no real root.");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("The root is x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("There are 2 roots: x1 = " + x1 + ", x2 = " + x2);
            }
        }
    }
}
