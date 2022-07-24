package com.arrays;

public class PandemicSimulator {

    public static int[][] pandemic(int[][] field, int[][] agents) {
        for (int[] agent :
                agents) {
            int row = agent[0];
            int column = agent[1];
            int infectionRate = field[row][column];
            if (infectionRate == 0) {
                field[row][column] = 1;
            } else {
                field[row][column] *= 2;
            }
        }
        return field;
    }

    public static void printAreaInfection(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] field = new int[5][5];
        int[][] agents = {{1, 4}, {0, 1}, {4, 2}, {4, 3}, {4, 3}, {0, 1}, {0, 2}, {4, 3}};
        int[][] result = pandemic(field, agents);

        printAreaInfection(result);

    }
}
