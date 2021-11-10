package tut8;

public class ValuePassingDemo {
    public static void method(int x) {
        x++;
    }

    public static void method2(Person p) {
        p.name = "Mr. Quan";
    }

    public static void main(String[] args) {
        Person q = new Person();
        q.name = "quan";
        method2(q); // passing by reference
        System.out.println(q.name);
    }
}
