package tut3;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // get a String
        System.out.print("Please enter a letter: ");
        String s = sc.nextLine();
        // verify the input String
        if (s.length() != 1) {
            System.out.println("Please enter exactly 1 character!");
        } else {
            // extract the first char
            char c = s.charAt(0);
            if (!Character.isLetter(c)) {
                System.out.println("Please enter a letter!");
            } else {
                char x = Character.toLowerCase(c);
                if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' || x == 'y') {
                    System.out.println(c + " is a vowel.");
                } else {
                    System.out.println(c + " is a consonant.");
                }
            }
        }
    }
}
