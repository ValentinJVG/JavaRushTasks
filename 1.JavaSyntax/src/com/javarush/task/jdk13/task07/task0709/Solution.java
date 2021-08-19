package com.javarush.task.jdk13.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Самая короткая строка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            strings.add(scanner.nextLine());
        }
        int smallestString = strings.get(0).length();
        for (String string : strings) {
            if (string.length() < smallestString) {
                smallestString = string.length();
            }
        }
        for (String string : strings) {
            if (string.length() == smallestString) {
                System.out.println(string);
            }
        }
    }
}
