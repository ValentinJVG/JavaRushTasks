package com.javarush.task.task18.task1820;

import java.io.*;
import java.util.Scanner;

/* 
Округление чисел
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String firstFileName = scanner.nextLine();
        String secondFileName = scanner.nextLine();
        Scanner scanner1 = new Scanner(new File(firstFileName));
        FileWriter writer = new FileWriter(secondFileName);
        while (scanner1.hasNextLine()) {
            String line = scanner1.nextLine();
            String[] addingNumbers = line.split(" ");
            for (String numbersInFile : addingNumbers) {
                double number = Double.parseDouble(numbersInFile);
                long rounded = Math.round(number);
                writer.write(rounded + " ");
            }
        }
        scanner.close();
        scanner1.close();
        writer.close();
    }
}
