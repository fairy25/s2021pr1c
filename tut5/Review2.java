package tut5;

import java.util.Arrays;
import java.util.Scanner;

public class Review2 {

    public static void a(int[] seq) {
        int min = seq[0], max = min;
        for (int i = 0; i < seq.length; i++) {
            if (seq[i] < min) min = seq[i];
            if (seq[i] > max) max = seq[i];
        }
        System.out.println("Smallest: " + min + ", largest: " + max);
    }

    public static void b(int[] seq) {
        int odd = 0, even = 0;
        for (int i = 0; i < seq.length; i++) {
            if (seq[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Odd: " + odd + ", even: " + even);
    }

    public static void c(int[] seq) {
        int sum = 0;
        for (int i = 0; i < seq.length; i++) {
            sum += seq[i];
            System.out.print(sum + " ");
        }
        System.out.println();
    }

    public static void d(int[] seq) {
        boolean duplicatePrinted = false;
        for (int i = 1; i < seq.length; i++) {
            if (seq[i] == seq[i - 1]) {
                if (!duplicatePrinted) System.out.print(seq[i] + " ");
                duplicatePrinted = true;
            } else {
                duplicatePrinted = false;
            }
        }
    }

    public static int[] getSequence() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sequence of numbers:");
        String seq = sc.nextLine();
        // abc 12 xy 15 16 sjdhfkjs 1238234
        for (int i = 0; i < seq.length(); i++) {
            if (seq.charAt(i) >= '0' && seq.charAt(i) <= '9'
                    || seq.charAt(i) == '-' || seq.charAt(i) == ' ') {
                continue; // skip remaining statements in loop body
            }
            System.out.println("Your sequence is not correct!");
            return null;
        }
        // seq = "1 2 5 7 8" -> {"1", "2", "5", "7", "8"}
        String[] nums = seq.split(" ");
        if (nums.length < 2) {
            System.out.println("Sequence too short!");
            return null;
        }
        int[] a = new int[nums.length];
        for (int i = 1; i < nums.length; i++) {
            a[i] = Integer.parseInt(nums[i]);
        }
        return a;
    }

    public static int[] getSequence2() {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int[] a = new int[n];
        System.out.println("Enter a sequence of numbers:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static void main(String[] args) {
        int[] seq = getSequence();
        System.out.println("Part A:");
        a(seq);
        System.out.println("Part B:");
        b(seq);
        System.out.println("Part C:");
        c(seq);
        System.out.println("Part D:");
        d(seq);
    }
}
