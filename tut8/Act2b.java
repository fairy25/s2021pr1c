package tut8;

public class Act2b {
    public static int[] shiftRight(int[] a) {
        // 1, 2, 3, 4
        // i = 3, 2, 1
        // a[3] = a[2]      1, 2, 3, 3
        // a[2] = a[1]      1, 2, 2, 3
        // a[1] = a[0]      1, 1, 2, 3
        int t = a[a.length - 1]; // save the last element
        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }
        a[0] = t;
        return a;
    }

    public static void main(String[] args) {
        int[] sample = {1, 2, 3, 4};
        int[] result = shiftRight(sample);
        for (int r : result) {
            System.out.print(r + " ");
        }
    }
}
