package com.company.Test1;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = {1, 8, 0, 6, 3};
        int n = 3;
        returnLargestNumbers(arr, n);

    }
    private static void returnLargestNumbers(int[] arr, int n) {
        int[] largest = new int[n];

        for (int i = 0; i < n; i++) {
            int maxIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;

            largest[i] = arr[i];
        }
        System.out.println(Arrays.toString(largest));
    }
}
