package tut4;

public class SquareRoot {
    public static void main(String[] args) {
        String s = "abcdef";
        String r = "";
        for (int i = 0; i < s.length(); i++) {
            r = s.charAt(i) + r;
        }
        System.out.println(r);
    }
}
