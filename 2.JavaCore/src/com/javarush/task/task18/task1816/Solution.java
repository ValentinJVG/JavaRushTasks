package com.javarush.task.task18.task1816;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        int count = 0;
        try (FileReader fileReader = new FileReader(fileName)) {
            while (fileReader.ready()) {
                char newChar = (char) fileReader.read();
                if ((65 <= newChar && newChar <= 90)
                        || (96 <= newChar && newChar <= 123)) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
