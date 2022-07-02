package com;

import java.util.Scanner;

public class Taxes {

    public static int taxEarnings(int earnings) { //УСН
        int tax = (earnings * 6) / 100;
        if (tax >= 0) {
            return tax;
        } else {
            // если расходы оказались больше, то налог посчитается отрицательным
            return 0;
        }
    }

    public static int taxEarningsMinusSpendings(int earnings, int spendings) { //УСН доходы минус расходы
        int tax = (earnings - spendings) * 15 / 100;
        if (tax >= 0) {
            return tax;
        } else {
            // если расходы оказались больше, то налог посчитается отрицательным
            return 0;
        }
    }

    public static void structure() {
        System.out.println("-------------");
        System.out.println("Select an operation and enter its number");
        System.out.println("1. Enter the amount of income:");
        System.out.println("2. Enter the expense amount:");
        System.out.println("3. Choose a tax system:");
        System.out.println(" To complete the program, enter end");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int earnings = 0;    // доходы
        int spendings = 0;   // расходы

        while (true) {
            structure();

            String input = scan.nextLine();
            if ("end".equals(input)) {
                break;
            }
            int operation = Integer.parseInt(input);

            switch (operation) {
                case 1:
                    System.out.println("Enter the amount of income:"); //доход
                    String moneyStr = scan.nextLine(); // Не используйте тут nextInt (!)
                    int money = Integer.parseInt(moneyStr);
                    earnings += money;
                    break;
                case 2:
                    // действия при выборе второй операции
                    System.out.println("Enter the expense amount:"); //расход
                    String moneySpnd = scan.nextLine();
                    int spend = Integer.parseInt(moneySpnd);
                    spendings += spend;
                    break;
                case 3:
                    //налог
                    int taxE = taxEarnings(earnings);
                    int taxES = taxEarningsMinusSpendings(earnings, spendings);
                    if (taxES <= taxE) {
                        System.out.println("We advise you to USN income minus expenses");
                        System.out.println("Your tax will be: " + taxES + " rub");
                        System.out.println("Tax on another system: " + taxE + " rub");
                        System.out.println("Economy: " + (taxE - taxES) + " rub");
                    } else {
                        System.out.println("We advise you to USN income");
                        System.out.println("Your tax will be: " + taxE + " rub");
                        System.out.println("Tax on another system: " + taxES + " rub");
                        System.out.println("Economy: " + (taxES - taxE) + " rub");
                    }
                    continue;
                default:
                    System.out.println("No such operation");
            }
        }

        System.out.println("The end program!");
    }
}
