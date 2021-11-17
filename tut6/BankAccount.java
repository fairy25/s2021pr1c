package lec6;

public class BankAccount {
    String name;
    double balance;
    int transactions;

    public BankAccount(String n, double init) {
        name = n;
        balance = init;
        transactions = 1;
    }

    public void deposit(double amt) {
        balance += amt;
    }

    public void withdraw(double amt) {
        balance -= amt;
    }

    public void monthlyFee() {
        withdraw(10);
    }

    public void annualInterest(double r) {
        deposit(balance * r / 100);
    }

    public void transfer(BankAccount target, double amt) {
        double fee = 0.5, total = amt + fee;
        if (total > balance) {
            System.out.println("Cannot transfer, not enough money!");
        } else {
            this.withdraw(total);
            target.deposit(amt);
        }
    }

    @Override
    public String toString() {
        String out = name + ", ";
        if (balance < 0) {
            out += "-$" + String.format("%.2f", -balance);
        } else {
            out += "$" + String.format("%.2f", balance);
        }
        return out;
    }
}
