class CreditAccountHandler extends AccountHandler {
    Account account;

    public CreditAccountHandler(Account account) {
        this.account = account;
    }

    protected void writeMessage(String msg) {
        System.out.println("Working with credit account: " + msg);
    }
}
