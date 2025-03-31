

public class Main {
    public static void main(String[] args) {

        Account account1 = new Account(100,"1234");
        Client client1 = new Client("Mario", account1);

        account1.deposit(20);
        account1.withdraw(30);

        client1.addFunds(10);
        client1.withdrawFunds(120);

    }
}