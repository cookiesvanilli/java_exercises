package bank.accounts;

public class CheckingAccount extends Account {

    private long minBalance = 0;

    public CheckingAccount(long balance, String namesOwner) {
        super(balance, namesOwner);
    }

    @Override
    public boolean pay(long amountSum) {
        if (minBalance > balance - amountSum) {
            return false;
        } else {
            balance -= amountSum;
            return true;
        }
    }
}
