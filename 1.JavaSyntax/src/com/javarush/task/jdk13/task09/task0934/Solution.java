package com.javarush.task.jdk13.task09.task0934;

/* 
Палиндром слова
*/

import java.util.Locale;

public class Solution {
    public static void main(String[] args) {
        String word = "Ротор";
        String answer = isPalindrome(word) ? "Да" : "Нет";
        System.out.println("Слово \"" + word + "\" палиндром? " + answer);
    }

    public static boolean isPalindrome(String word) {
        StringBuilder s = new StringBuilder(word);
        return word.equalsIgnoreCase(String.valueOf(s.reverse()));
    }
}
