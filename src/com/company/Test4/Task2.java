package com.company.Test4;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] number = {1, 3, 4, 5};
        int[] number1 = {3, 1, 5, 4};
        int[] number2 = {1, -1, 3, 2};
        System.out.println(findMissingNumber(number));
        System.out.println(findMissingNumber(number1));
        System.out.println(findMissingNumber(number2));
    }

    public static int findMissingNumber(int[] arr) {
        try {
            Arrays.sort(arr);
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] != arr[i - 1] + 1) {
                    return arr[i - 1] + 1;
                }
            }
            return 0;
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            return -1;
        }
    }
}
