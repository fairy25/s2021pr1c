package tut4;

public class FibonacciUpToN {
    public static void main(String[] args) {
        int n = 100;
        int p2 = 1;
        int p1 = 0;
        int fibo = 0;
        while (fibo <= n) {
            System.out.print(fibo + " ");
            fibo = p2 + p1;
            p2 = p1;
            p1 = fibo;
        }
    }
}
