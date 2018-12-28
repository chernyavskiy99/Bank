public abstract class AccountTemplate {

    private double money;

    void setMoney(double money) {
        this.money = money;
    }

    abstract public void withdrawMoney(double money);

    public void replenishAccount(double money) {
        this.money += money;
    }

    abstract public void transferFunds(double money, Account account);
}
