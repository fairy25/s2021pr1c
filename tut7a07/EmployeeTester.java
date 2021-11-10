package tut7a07;

public class EmployeeTester {
    public static void main(String[] args) {
        Employee harry = new Employee("Harry Jones", 50000);
        harry.raiseSalary(-10); // Harry gets a 10 percent raise
        System.out.println(harry.getSalary());
    }
}
