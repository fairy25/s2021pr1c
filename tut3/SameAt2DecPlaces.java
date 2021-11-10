package tut3;

import java.util.Scanner;

public class SameAt2DecPlaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter two real numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        int x = (int) (a * 100);
        int y = (int) (b * 100);
        if (x == y) {
            System.out.println("They're the same up to 2 decimal places.");
        } else {
            System.out.println("They're not the same.");
        }
    }
}
