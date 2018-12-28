class DepositAccountHandler extends AccountHandler {
    Account account;

    public DepositAccountHandler(Account account) {
        this.account = account;
    }

    protected void writeMessage(String msg) {
        System.out.println("Working with deposit account " + msg);
    }
}
