package com.javaguru.lessons.lesson7;

class TwoDimensionalArray {

    public static void main(String[] args) {
        int[][] table = new int[5][5];

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = i * j;
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}
