package tut4;

public class ReverseString {
    public static void main(String[] args) {

        double n = 10;
        double s = 1; // let's guess it to be 1
        double prev;
        do {
            prev = s;
            s = (s + n / s) / 2;
        } while (s != prev);
        System.out.println(s);
    }
}
