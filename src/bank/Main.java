package bank;

import bank.accounts.CheckingAccount;
import bank.accounts.CreditAccount;
import bank.accounts.SavingAccount;
import bank.clients.Client;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*SavingAccount save = new SavingAccount(1000, "Inna", 500);
        boolean one = save.pay(600);
        System.out.println("First case = " + one + " " + save.getBalance());

        boolean two = save.pay(100);
        System.out.println("Second case = " + two + " " + save.getBalance());

        CheckingAccount check = new CheckingAccount(2000, "Inna");
        boolean three = check.pay(1500);
        System.out.println("Three case = " + three + " " + check.getBalance());

        boolean four = check.pay(2500);
        System.out.println("Four case = " + four + " " + check.getBalance());

        boolean five = check.pay(500);
        System.out.println("Five case = " + five + " " + check.getBalance());

        CreditAccount credit = new CreditAccount(-1000, "Inna");
        boolean six = credit.add(1500);
        System.out.println("Six case = " + six + " " + credit.getBalance());

        boolean seven = credit.add(100);
        System.out.println("Seven case = " + seven + " " + credit.getBalance());*/

        Client client = new Client("Alex", 2);
        CheckingAccount check = new CheckingAccount(2000, client.getName());
        System.out.println(Arrays.toString(client.accounts));
        client.addNewAccount(check);

        System.out.println(client.accounts[0].getBalance());

        SavingAccount save = new SavingAccount(4000, client.getName(), 500);
        client.addNewAccount(save);

        boolean paid =  client.searchPayAccount(2500);
        System.out.println("We paid: " + paid);

    }
}
