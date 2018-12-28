public class CreditAccount extends AccountTemplate implements Account {

    private double money;
    private Client client;
    private double commission;

    CreditAccount (Client client, double money, double commission) {
        this.client = client;
        this.money = money;
        this.commission = commission;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public void withdrawMoney(double money) {
        this.money -= money;
    }

    @Override
    public void transferFunds(double money, Account account) {
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
