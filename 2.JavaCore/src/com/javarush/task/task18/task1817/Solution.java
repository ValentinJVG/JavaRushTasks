package com.javarush.task.task18.task1817;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int spacesCount = 0;
        int symbolsCount = 0;
        FileReader fileReader = new FileReader(args[0]);
        while (fileReader.ready()) {
            int character = fileReader.read();
            if (character == (int) ' ') {
                spacesCount++;
            } else {
                symbolsCount++;
            }
        }
        int allSymbols = spacesCount + symbolsCount;
        double result = (double) spacesCount / (double) allSymbols * 100;
        System.out.printf("%.2f", result);
        fileReader.close();
    }
}
