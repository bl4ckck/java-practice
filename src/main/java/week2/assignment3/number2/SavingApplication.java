package week2.assignment3.number2;

public class SavingApplication {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("Alvin Naufal", "03425", 250.45);
        savingsAccount.deposit(200);
        savingsAccount.withdraw(250);

        System.out.println(savingsAccount.toStringParent());
        System.out.println(savingsAccount);
    }
}
