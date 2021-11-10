package tut3;

import java.util.Scanner;

public class FloatEvaluation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a real number: ");
        double a = sc.nextDouble();
        if (a < -1000000) {
            System.out.println("A large negative number.");
        } else if (a <= -1) {
            System.out.println("A negative number.");
        } else if (a < 0) {
            System.out.println("A small negative number.");
        } else if (a == 0) {
            System.out.println("The number is zero.");
        } else if (a < 1) {
            System.out.println("A small positive number.");
        } else if (a < 1000000) {
            System.out.println("A positive number.");
        } else {
            System.out.println("A large positive number.");
        }
    }
}
