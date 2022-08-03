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

    @Override
    public boolean transfer(Account accountTo, int amount) {
        boolean canPay = balance + amount > 0;

        if (canPay) {
            if (accountTo.add(amount)) {
                return super.pay(amount);
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean acceptMoney(int money) {
        if ((balance + money) < 0) {
            return true;
        }
        return false;
    }

}
