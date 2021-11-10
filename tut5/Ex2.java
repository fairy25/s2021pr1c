package tut5;

import java.util.Scanner;

public class Ex2 {
    public static boolean isVowel(char c) {
        // if UPPERCASE, convert to lowercase
        if (c >= 65 && c <= 90) c += 32;
        if (c == 'a' || c == 'e' || c == 'i'
                || c == 'o' || c == 'u' || c == 'y') {
            return true;
        } else {
            return false;
        }
    }

    public static void printUppercaseChars(String s) {
        for (int i = 0; i < s.length(); i++) {
            // A (65), Z (90)
            if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
                System.out.print(s.charAt(i));
            }
        }
    }

    public static void everySecondLetter(String s) {
        // remove all spaces
        String s1 = s.replace(" ", "");
        // starting from second char, go with step of 2
        for (int i = 1; i < s1.length(); i += 2) {
            System.out.print(s1.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        printUppercaseChars(s);
        System.out.println();
        everySecondLetter(s);
    }
}
// Hello Mr. QUAN, How are you?