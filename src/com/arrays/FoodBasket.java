package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FoodBasket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] products = {"Bread", "Apples", "Milk"};
        int[] prices = {100, 200, 300};
        int[] count = {0, 0, 0};

        int productNumber = 0; // номер продукта
        int productCount = 0; // количество
        int currentPrice; // prices[productNumber]; //цена продукта в массиве цен
        int sumProducts = 0; // итого


        System.out.println(Arrays.toString(products));
        System.out.println(Arrays.toString(prices));
        System.out.println("------------");
        System.out.println("List of possible products to buy");

        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + "." + products[i] + " - " + prices[i] + " rub/piece");
        }

        while (true) {
            System.out.println("Select the product and quantity or enter `end`");
            String input = scan.nextLine();
            if ("end".equals(input)) {
                break;
            }

            String[] productAndCount = input.split(" ");// массив строк из введенной строки пользователя
            //System.out.println(Arrays.toString(productAndCount));
            productNumber = Integer.parseInt(productAndCount[0]) - 1; // индекс товара
            productCount = Integer.parseInt(productAndCount[1]); // количество товара

            if (productNumber >= 0 && productNumber < products.length) {
                if (productCount > 0) {
                    count[productNumber] += productCount;// количество товара записывается в массив

                    currentPrice = prices[productNumber] * productCount;//цена товара зв весь товар
                    System.out.println(currentPrice);

                    sumProducts += currentPrice;
                    //System.out.println("Sum: " + sumProducts);
                } else {
                    System.out.println("Wrong count");
                }

            } else {
                System.out.println("This product is not exist");
            }

        }
        System.out.println("Your shopping cart:");
        for (int i = 0; i < products.length; i++) {
            if (count[i] != 0) {
                System.out.println(products[i] + " " + count[i] + "pc " + prices[i] * count[i] + " rub in total");
            }
        }
        System.out.println("Total: " + sumProducts);
    }
}
