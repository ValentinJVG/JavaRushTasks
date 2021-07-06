package com.javarush.task.jdk13.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/* 
Два массива
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] arrayOfIntegers = new int[10];
        String[] arraysOfStrings = new String[10];
        for (int i = 0; i < arraysOfStrings.length; i++) {
            String string = scanner.nextLine();
            arraysOfStrings[i] = string;
        }
        for (int i = 0; i < arrayOfIntegers.length; i++) {
            arrayOfIntegers[i] = arraysOfStrings[i].length();
        }
        for (int arrayOfInteger : arrayOfIntegers) {
            System.out.println(arrayOfInteger);
        }
    }
}