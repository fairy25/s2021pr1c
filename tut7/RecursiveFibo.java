package tut7;

public class RecursiveFibo {
    public static void printFibonacci(int n, int finish, int p2, int p1) {
        if (n > finish) return;
        if (n == 1) {
            System.out.print("0 ");
            printFibonacci(2, finish, 0, 0);
        } else if (n == 2) {
            System.out.print("1 ");
            printFibonacci(3, finish, 0, 1);
        } else {
            System.out.print((p2 + p1) + " ");
            printFibonacci(n + 1, finish, p1, p2 + p1);
        }
    }

    public static void main(String[] args) {
        printFibonacci(1, 10, 0, 0);
    }
}
