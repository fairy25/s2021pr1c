package lec6;

public class CarDemo {
    public static void main(String[] args) {
        Car myHybrid = new Car(50);
        myHybrid.addGas(20);
        myHybrid.drive(300);
        double gasLeft = myHybrid.checkGas();
        System.out.println(gasLeft);
    }
}
