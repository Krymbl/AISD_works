package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] field = { {3, 1, 7, 2, 5},
                {6, 8, 4, 3, 1},
                {2, 5, 9, 6, 4},
                {7, 3, 8, 1, 2},
                {4, 2, 6, 5, 3}};

        System.out.println(action(field));
    }

    public static int action(int[][] field) {
        int n = field.length ;
        int m = field[0].length;
        int[][] myField = new int[n][m];

        myField[0][0] = field[0][0];
        for (int i = 1; i < m; i++) {
            myField[0][i] = field[0][i] + myField[0][i-1];
        }
        for (int i = 1; i < n; i++) {
            myField[i][0] = field[i][0] + myField[i-1][0];
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if ((field[i][j] + myField[i-1][j]) > (field[i][j] + myField[i][j-1])) {
                    myField[i][j] = field[i][j] + myField[i][j-1];
                } else {
                    myField[i][j] = field[i][j] + myField[i - 1][j];
                }
            }
        }

        for (int[] x : myField) {
            System.out.println(Arrays.toString(x));
        }
        return myField[n-1][m-1];
    }
}