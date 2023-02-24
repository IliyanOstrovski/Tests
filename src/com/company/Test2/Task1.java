package com.company.Test2;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(sameLetters("abc", "cba"));
        System.out.println(sameLetters("abc", "ab"));
        System.out.println(sameLetters("ababc", "abcccc"));
    }

    public static boolean sameLetters(String s1, String s2) {
        boolean[] lettersInS1 = new boolean[26]; // initialize array with 26 values for each letter
        boolean[] lettersInS2 = new boolean[26];

        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            lettersInS1[c - 'a'] = true; // set the flag for the corresponding letter to true
        }

        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            lettersInS2[c - 'a'] = true; // set the flag for the corresponding letter to true
        }

        // Compare the sets of seen letters
        for (int i = 0; i < 26; i++) {
            if (lettersInS1[i] != lettersInS2[i]) {
                return false; // if a letter is seen in one string but not the other, return false
            }
        }
        return true;
    }
}

