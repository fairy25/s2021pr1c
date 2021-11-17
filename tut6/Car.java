package lec6;

public class Car {
    double fuel;
    double efficiency;

    public Car(double e) {
        fuel = 0;
        efficiency = e;
    }

    public void addGas(double g) {
        fuel += g;
    }

    public void drive(double d) {
        fuel -= d / efficiency;
    }

    public double checkGas() {
        return fuel;
    }
}
