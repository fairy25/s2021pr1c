package tut6;

public class FactorGenerator {
    int n; // attribute (field)
    int currentFactor;

    public FactorGenerator(int numberToFactor) {
        n = numberToFactor;
        currentFactor = 2;
    }

    public int nextFactor() {
        if (!hasMoreFactors()) return 0;
        while (n % currentFactor != 0) {
            currentFactor++;
        }
        n /= currentFactor;
        return currentFactor;
    }

    public boolean hasMoreFactors() {
        return n > 1;
    }

    public static void main(String[] args) {
        FactorGenerator fg = new FactorGenerator(2736431);
        while (fg.hasMoreFactors()) {
            System.out.println(fg.nextFactor());
        }
    }
}
