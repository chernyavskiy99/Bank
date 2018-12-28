public class AccountDecorator implements Account {
    private double threshold;
    private double money;
    private Client client;

    void setThreshold(double threshold) {
        this.threshold = threshold;
    }

    void setMoney(double money) {
        this.money = money;
    }

    void setClient(Client client) {
        this.client = client;
    }

    @Override
    public void withdrawMoney(double money) {
        if (client.getAddress().equals(null) || client.getPassportId().equals(null)) {
            this.money = Math.max(0, this.money - Math.min(threshold, money));
        } else {
            money = Math.max(0, this.money - money);
        }
    }

    @Override
    public void replenishAccount(double money) {

    }

    @Override
    public void transferFunds(double money, Account account) {
        if (client.getAddress().equals(null) || client.getPassportId().equals(null)) {
            this.money = Math.max(0, this.money - Math.min(threshold, money));
            if (account.getClass().equals(CurrentAccount.class)) {
                ((CurrentAccount) account).setMoney(money);
            } else if (account.getClass().equals(DepositAccount.class)) {
                ((DepositAccount) account).setMoney(money);
            } else if (account.getClass().equals(CreditAccount.class)) {
                ((CreditAccount) account).setMoney(money);
            }
        } else {
            money = Math.max(0, this.money - money);
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
