public class Client {
    private String name;
    private Account account;

    public Client(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    public void addFunds(double amount) {
        this.account.deposit(amount);
    }

    public void withdrawFunds(double amount) {
        this.account.withdraw(amount);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }


}
