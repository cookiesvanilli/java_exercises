package com;

import java.util.Scanner;

public class NameGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String maxName = null;
        while (true) {
            System.out.println("----------");
            System.out.println("Enter the name with a capital letter:");
            String input = scan.nextLine();

            if ("end".equals(input)) {
                System.out.println("The program is completed!");
                break;
            }
            String name = input; // "переименуем" переменную, чтобы легче было работать; на этом этапе мы знаем, что ввели имя

            boolean capitalLetter = Character.isUpperCase(name.charAt(0));

            if (capitalLetter) {
                if (maxName == null) {
                    System.out.println("This is the first name entered!");
                    maxName = name;
                } else if (name.length() > maxName.length()) {
                    int characterDifference = name.length() - maxName.length();
                    maxName = name;
                    System.out.println("Longest name " + maxName + " it is longer by " + characterDifference);
                } else {
                    System.out.println("Longest name " + maxName + " it is longer by " + (maxName.length() - name.length()));
                }
                System.out.println();
            } else {
                System.out.println("Names must be entered with a capital letter!");
            }

        }
    }

}
