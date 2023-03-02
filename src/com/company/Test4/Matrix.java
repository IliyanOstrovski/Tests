package com.company.Test4;

public class Matrix {
    private int[][] matrix;
    private int rows;
    private int columns;

    public Matrix(int rows, int columns) {
        try {
            if (rows <= 0 || columns <= 0) {
                throw new IllegalArgumentException("Matrix dimensions must be positive");
            }
            this.rows = rows;
            this.columns = columns;
            matrix = new int[rows][columns];
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public Matrix(int rows, int columns, int defaultVal) {
        this(rows, columns);
        fill(defaultVal);
    }

    public void fill(int value) {
        try {
            if (matrix == null) {
                throw new IllegalStateException("Matrix not initialized");
            }
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    matrix[i][j] = value;
                }
            }
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }

    public void clear() {
        fill(0);
    }

    public int[] getRow(int row) {
        try {
            if (matrix == null || rows == 0 || row < 0 || row >= rows) {
                throw new IndexOutOfBoundsException("Invalid row index");
            }
            return matrix[row];
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public int[] getColumn(int col) {
        try {
            if (matrix == null || columns == 0 || col < 0 || col >= columns) {
                throw new IndexOutOfBoundsException("Invalid column index");
            }
            int[] result = new int[rows];
            for (int i = 0; i < rows; i++) {
                result[i] = matrix[i][col];
            }
            return result;
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public void set(int x, int y, int value) {
        try {
            if (matrix == null || rows == 0 || columns == 0 || x < 0 || y < 0 || x >= rows || y >= columns) {
                throw new IndexOutOfBoundsException("Invalid indices");
            }
            matrix[x][y] = value;
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    public int get(int x, int y) {
        try {
            if (matrix == null || rows == 0 || columns == 0 || x < 0 || y < 0 || x >= rows || y >= columns) {
                throw new IndexOutOfBoundsException("Invalid indices");
            }
            return matrix[x][y];
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result.append(matrix[i][j]).append(" ");
            }
            result.append("\n");
        }
        return result.toString();
    }

    public Matrix subMatrix(int x1, int y1, int x2, int y2) {
        Matrix sub = new Matrix(x2 - x1 + 1, y2 - y1 + 1);
        for (int i = x1; i <= x2; i++) {
            for (int j = y1; j <= y2; j++) {
                sub.set(i - x1, j - y1, matrix[i][j]);
            }
        }
        return sub;
    }
}

