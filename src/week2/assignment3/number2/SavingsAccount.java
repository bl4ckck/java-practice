package week2.assignment3.number2;

public class SavingsAccount extends Account {
    private double balance;

    public SavingsAccount(String name, String accountNumber, double balance) {
        super(name, accountNumber);
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void currentBalance(String action) {
        System.out.println("("+action+") "+"Current balance: " + this.balance);
    }

    public void deposit(double money) {
        this.balance += money;
        this.currentBalance("Deposit");
    }

    public void withdraw(double money) {
        this.balance -= money;
        this.currentBalance("Withdraw");
    }

    public String toStringParent() {
        return super.toString();
    }

    @Override
    public String toString() {
        return "\n"+super.resTemplate(this.getClass()) + super.accountInfo()
                + "\n$" + this.balance;
    }
}
