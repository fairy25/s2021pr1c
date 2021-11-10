package tut2;

public class TriangleArea {
    public static void main(String[] args) {
        double b = 3;
        System.out.println("Base length: " + b);
        double hb = 2.4;
        System.out.println("Height: " + hb);
        double area = 100 * b * hb / 2;
        area = Math.round(area);
        area = area / 100;
        System.out.println("Triangle area: " + area);
    }
}
