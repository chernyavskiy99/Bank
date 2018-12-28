public class CurrentAccount implements Account {

    private double money;
    private Client client;
    private double interestOnTheBalance;

    CurrentAccount(Client client, double money, double interestOnTheBalance) {
        this.client = client;
        this.money = money;
        this.interestOnTheBalance = interestOnTheBalance;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public void withdrawMoney(double money) {
        if (this.money > money) {
            this.money -= money;
        }
    }

    @Override
    public void replenishAccount(double money) {
        this.money += money;
    }

    @Override
    public void transferFunds(double money, Account account) {
        if (this.money > money) {
            this.money -= money;
            if (account.getClass().equals(CurrentAccount.class)) {
                ((CurrentAccount) account).setMoney(money);
            } else if (account.getClass().equals(DepositAccount.class)) {
                ((DepositAccount) account).setMoney(money);
            } else if (account.getClass().equals(CreditAccount.class)) {
                ((CreditAccount) account).setMoney(money);
            }
        }
    }
}
