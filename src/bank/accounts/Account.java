package bank.accounts;

public class Account {

    protected long balance;
    protected String namesOwner;

    public Account(long balance, String namesOwner) {
        this.balance = balance;
        this.namesOwner = namesOwner;
    }

    public boolean pay(long amountSum) {
        balance -= amountSum;
        return true;
    }

    public boolean add(long amountAdd) {
        balance += amountAdd;
        return true;
    }

    public long getBalance() {
        return this.balance;
    }

}
