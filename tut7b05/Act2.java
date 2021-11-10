package tut7b05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Act2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        boolean valid = false;
        while (!valid) {
            System.out.print("Enter an integer between 1000 and 999999: ");
            try {
                n = sc.nextInt();
            } catch (InputMismatchException e) {
                // clear the stdin buffer
                sc.nextLine();
            }
            if (n > 999 && n < 1000000) valid = true;
        }
        String s = Integer.toString(n);
        String right = s.substring(s.length() - 3);
        String left = s.substring(0, s.length() - 3);
        System.out.println(left + "," + right);
    }
}
