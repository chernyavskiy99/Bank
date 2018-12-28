abstract class AccountHandler {
    public void message(String msg, int priority) {
        writeMessage(msg);
    }

    abstract protected void writeMessage(String msg);
}


