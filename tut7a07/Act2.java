package tut7a07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Act2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean gotValidNum = false;
        int n = 0;
        while (!gotValidNum) {
            try {
                System.out.print("Enter an integer between 1000 and 999999: ");
                n = sc.nextInt();
                if (n > 999 && n < 1000000) {
                    gotValidNum = true;
                }
            } catch (InputMismatchException e) {
                // clean the input cache (stdin buffer)
                sc.nextLine();
            }
        }
        String s = Integer.toString(n);
        String right = s.substring(s.length() - 3);
        String left = s.substring(0, s.length() - 3);
        System.out.println(left + "," + right);
    }
}
