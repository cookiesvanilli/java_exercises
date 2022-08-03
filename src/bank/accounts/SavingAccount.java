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

    @Override
    public boolean add(long amountAdd) {
        return super.add(amountAdd);
    }

    @Override
    public boolean transfer(Account accountTo, int amount) {
        boolean canPay = balance - amount > minBalance;

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
        if (add(money)) {
            return true;
        }
        return false;
    }
}
