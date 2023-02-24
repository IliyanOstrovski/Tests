package com.company.Test2;

public class Task2 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "1212";
        String s3 = "alaala";
        String s4 = "alaal";
        String s5 = "zzzzz";

        System.out.println(isSequential(s1));
        System.out.println(isSequential(s2));
        System.out.println(isSequential(s3));
        System.out.println(isSequential(s4));
        System.out.println(isSequential(s5));

    }

    public static boolean isSequential(String s) {
        if (s.length() < 2) {
            return false;
        }
        for (int i = 1; i <= s.length() / 2; i++) {
            if (s.length() % i == 0) {
                String pattern = s.substring(0, i);
                int j = i;
                while (j < s.length() && s.substring(j, j + i).equals(pattern)) {
                    j += i;
                }
                if (j == s.length()) {
                    return true;
                }
            }
        }
        return false;
    }
}
