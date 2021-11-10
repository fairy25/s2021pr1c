package tut7a07;

public class Act4 {
    public static String reverse(String in) {
        if (in.length() < 2) {
            return in;
        } else {
            return reverse(in.substring(1)) + in.charAt(0);
        }
    }

    public static void main(String[] args) {
        System.out.println(reverse("HelloWorld"));
    }
}
