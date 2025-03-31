public class Account {

    private double balance;
    private String accountNumber;

    public Account(double balance, String accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Saldo: " + this.balance);
    }

    public void withdraw(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Prelievo accettato, Saldo: " + this.balance);
        } else {
            System.out.println("Saldo insufficiente, Saldo: " + this.balance);
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
