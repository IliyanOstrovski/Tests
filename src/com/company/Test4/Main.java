package com.company.Test4;

public class Main {
    public static void main(String[] args) {

        Matrix matrix1 = new Matrix(3, 3);
        System.out.println(matrix1);

        Matrix matrix2 = new Matrix(2, 4, 5);
        System.out.println(matrix2);

        matrix2.set(1, 2, 10);
        System.out.println(matrix2);

        int[] row = matrix1.getRow(1);
        if (row != null) {
            for (int j : row) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        int[] col = matrix2.getColumn(3);
        if (col != null) {
            for (int j : col) {
                System.out.println(j);
            }
        }

        Matrix sub = matrix2.subMatrix(0, 0, 1, 1);
        System.out.println(sub);

        matrix1.clear();
        System.out.println(matrix1);
    }
}
