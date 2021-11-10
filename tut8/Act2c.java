package tut8;

public class Act2c {
    public static void shiftRight(int[] a) {
        int t = a[a.length - 1];
        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }
        a[0] = t;
    }

    public static void main(String[] args) {
        int[] sample = {1, 2, 3, 4};
        shiftRight(sample); // this method modifies 'sample'
        // passing by reference
        for (int r : sample) {
            System.out.print(r + " ");
        }
    }
}