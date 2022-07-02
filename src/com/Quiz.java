package com;

import java.util.Scanner;

public class Quiz {
    public static Scanner scanner = new Scanner(System.in);

    public static String ask(String message, String example) {
        System.out.println(message);
        System.out.println("��������: " + example);
        System.out.print(">> ");
        String input = scanner.nextLine();
        System.out.println();
        return input;
    }

    public static int extractTime(String task, String phrase) {
        int pos = task.indexOf(phrase);
        pos += phrase.length();
        String timeStr = task.substring(pos, pos + 2);
        timeStr = timeStr.trim();
        int time = Integer.parseInt(timeStr);
        return time;
    }

    public static void main(String[] args) {
        String name = ask("���", "����");

        int totalTime = 0;
        int totalFinishTime = 0;
        int maxTime = 0;
        int tasksCount = 0;

        while (true) {
            String input = ask(
                    "����� ������ �� ������� ��� end ��� ������",
                    "���� ���������������, ����� � 11 � ������� � 17 �����"
            );

            if (input.equals("end")) {
                break;
            }

            String task = input;

            int startTime = extractTime(task, "����� � ");
            int endTime = extractTime(task, "������� � ");
            int spentTime = endTime - startTime;

            totalTime += spentTime;
            totalFinishTime = Math.max(totalFinishTime, endTime);
            maxTime = Math.max(maxTime, spentTime);
            tasksCount++;
        }

        System.out.println(
                "���������, " + name + "! � ����� ������ �� �������:\n" +
                        "  ����� �����: " + tasksCount + "\n" +
                        "  ��������� ���������� � " + totalFinishTime + "\n" +
                        "  � ������� ������ �������� " +
                        (tasksCount != 0 ? ((totalTime * 60.0) / tasksCount) : 0) + " �����\n" +
                        "  ��� ������ ������ " +
                        totalTime + " �����\n" +
                        "����� �� �������! :)"
        );
    }
}
