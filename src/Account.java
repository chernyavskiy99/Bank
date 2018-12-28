interface Account {

    void withdrawMoney(double money);

    void replenishAccount(double money);

    void transferFunds(double money, Account account);
}
