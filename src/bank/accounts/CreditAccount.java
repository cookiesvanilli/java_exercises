package bank.accounts;

public class CreditAccount extends Account {
    public CreditAccount(long balance, String namesOwner) {
        super(balance, namesOwner);
    }

    @Override
    public boolean add(long amountAdd) {
        if (balance + amountAdd > 0) {
            return false;
        } else {
            balance += amountAdd;
            return true;
        }
    }
}
