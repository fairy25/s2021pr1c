package lec6;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Quan", 300.111111);
        BankAccount acc2 = new BankAccount("John", 10);
        acc.deposit(60);
        acc.withdraw(100);
        acc.annualInterest(8.3);
        acc.monthlyFee();
        System.out.println(acc); // before transfer
        acc.transfer(acc2, 20);
        System.out.println(acc); // after transfer
        System.out.println(acc2); // will print the result of toString()
    }
}
