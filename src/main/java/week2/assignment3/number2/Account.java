package week2.assignment3.number2;

public class Account {
    private String name;
    private String accountNumber;

    public Account(String name, String accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    protected String resTemplate(Class<? extends Account> clazz) {
        return "Hasil dari toString() untuk "+ clazz.getSimpleName() +" adalah: ";
    }

    protected String accountInfo() {
        return "\n" + this.accountNumber +
                "\n" + this.name;
    }

    @Override
    public String toString() {
        return "\n"+this.resTemplate(Account.class) + this.accountInfo();
    }
}
