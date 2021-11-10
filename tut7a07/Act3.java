package tut7a07;

public class Act3 {
    public static String toBinary(int n) {
        // base case: toBinary(0) and toBinary(1)
        // recursive/general case: toBinary(n) = toBinary(n / 2) + n % 2;
        // TODO: implement and test this method in 5 minutes
        if (n == 0) {
            return "0";
        } else if (n == 1) {
            return "1";
        } else {
            return toBinary(n / 2) + n % 2;
        }
    }
    public static void main(String[] args) {
        // TODO: use Scanner to read integer from user
        // convert to binary
        // show results...
    }
}
