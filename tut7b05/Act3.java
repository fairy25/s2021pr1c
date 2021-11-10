package tut7b05;

public class Act3 {
    static String bin(int n) {
        if (n == 0) return "0";
        else if (n == 1) return "1";
        else return bin(n / 2) + (n % 2);
    }

    public static void main(String[] args) {
        System.out.println(bin(8));
        System.out.println(bin(9));
        System.out.println(bin(10));
    }
}
