package com.company.Test4;
public class Task3 {

    public static void main(String[] args) {
        String str = "abc133d";
        String str1 = "alabala";
        System.out.println(rearrange(str));
        System.out.println(rearrange(str1));
    }

    public static String rearrange(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        StringBuilder letters = new StringBuilder();
        StringBuilder digits = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetter(c)) {
                letters.append(c);
            } else if (Character.isDigit(c)) {
                digits.append(c);
            }
        }

        if (letters.length() > 1 && digits.length() > 1 &&
                Math.abs(letters.length() - digits.length()) > 1) {
            return ""; // Not possible to rearrange
        }

        int i = 0, j = 0;
        StringBuilder result = new StringBuilder();

        while (i < letters.length() || j < digits.length()) {
            if (i < letters.length()) {
                result.append(letters.charAt(i));
                i++;
            }
            if (j < digits.length()) {
                result.append(digits.charAt(j));
                j++;
            }
        }

        return result.toString();
    }
}
