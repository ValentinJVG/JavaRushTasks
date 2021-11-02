package com.javarush.task.jdk13.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Нужно заменить функциональность программы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<>();
        while (true) {
            String string = reader.readLine();
            if (string == null || string.isEmpty()) {
                break;
            }
            strings.add(string);
        }

        ArrayList<String> resultStrings = new ArrayList<>();
        for (String string : strings) {
            String result;
            if (string.length() % 2 == 0) {
                result = string + " " + string;
            } else {
                result = string + " " + string + " " + string;
            }
            resultStrings.add(result);
        }

        for (String resultString : resultStrings) {
            System.out.println(resultString);
        }
    }
}
