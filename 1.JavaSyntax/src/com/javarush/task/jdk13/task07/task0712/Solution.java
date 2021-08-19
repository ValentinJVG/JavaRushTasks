package com.javarush.task.jdk13.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Минимальное или максимальное
*/

public class Solution {

    public static ArrayList<String> strings;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        strings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = scanner.nextLine();
            strings.add(s);
        }
        String indexOfSmallestString = strings.get(0);
        String indexOfLargestString = strings.get(0);
        int smallestString = 0;
        int largestString = 0;
        for (int i = 0; i < 10; i++) {
            if (strings.get(i).length() < indexOfSmallestString.length()) {
                indexOfSmallestString = strings.get(i);
                smallestString = i;
            } else if (strings.get(i).length() > indexOfLargestString.length()) {
                indexOfLargestString = strings.get(i);
                largestString = i;
            }
        }

        if (smallestString < largestString) {
            System.out.println(indexOfSmallestString);
        } else {
            System.out.println(indexOfLargestString);
        }
    }
}
