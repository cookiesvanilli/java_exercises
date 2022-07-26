package bank.accounts;

public class SavingAccount extends Account {

    private long minBalance;

    public SavingAccount(long balance, String namesOwner, long minBalance) {
        super(balance, namesOwner);
        this.minBalance = minBalance;
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
