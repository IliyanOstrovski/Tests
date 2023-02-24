package com.company.Test1;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 8, 1, 16, 3, 4};

        removeDuplicateNumbers(arr);
        System.out.println(Arrays.toString(removeDuplicateNumbers(arr)));
    }

    public static int[] removeDuplicateNumbers(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int[] uniqueArr = new int[set.size()];
        int i = 0;
        for (int num : arr) {
            if (set.contains(num)) {
                uniqueArr[i++] = num;
                set.remove(num);
            }
        }
        return uniqueArr;
    }
}