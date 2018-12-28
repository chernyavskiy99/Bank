public class AccountFactory {

    private Client client;
    private double money;
    private double commission;
    private double interestOnTheBalance;

    AccountFactory() {

    }

    AccountFactory(Client client, double money, double commission, double interestOnTheBalance) {
        this.client = client;
        this.money = money;
        this.commission = commission;
        this.interestOnTheBalance = interestOnTheBalance;
    }

    public Account getCurrentAccount() {
        return new CurrentAccount(client, money, interestOnTheBalance);
    }

    public Account getDepositAccount() {
        return new DepositAccount(client, money, interestOnTheBalance);
    }

    public Account getCreditAccount() {
        return new CreditAccount(client, money, commission);
    }
}
