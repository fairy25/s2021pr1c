package tut2;

public class VndToJpy {
    public static void main(String[] args) {
        int vnd = 1200000;
        int rate = 207;
        int jpy = vnd / rate;
        // 1200000 VND is roughly 5797 JPY.
        System.out.println(vnd + " VND is roughly " + jpy + " JPY.");
    }
}
