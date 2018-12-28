class CurrentAccountHandler extends AccountHandler {
    Account account;

    public CurrentAccountHandler(Account account) {
        this.account = account;
    }

    protected void writeMessage(String msg) {
        System.out.println("Working with current account: " + msg);
    }
}