package bank.clients;

import bank.accounts.Account;

public class Client implements MoneyTarget {
    protected String name;
    public Account[] accounts;

    public Client(String name, int numOfAccounts) {
        this.name = name;
        accounts = new Account[numOfAccounts];
    }

    public String getName() {
        return this.name;
    }

    //метод, который ищет счёт, с которого можно заплатить
    public boolean searchPayAccount(int amount) {
        for (Account account : accounts) {
            if (account != null) {
                boolean result = account.pay(amount);
                if (result) {
                    return true;
                }
            }
        }
        return false;
    }

    //метод добавления нового счёта
    public void addNewAccount(Account account) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = account;
                return;
            }
        }
        // если дошли сюда, значит не нашлось свободной ячейки, иначе бы уже ушли из for
        System.out.println("Мест для добавления нового счёта нет! :(");
    }

    @Override
    public boolean acceptMoney(int money) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != null) {
                if (accounts[i].add(money)) {
                    return true;
                }
            }
        }

        return false;
    }
}
