package com.javarush.task.task18.task1819;

import java.io.*;
import java.util.Scanner;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String firstFileName = scanner.nextLine();
        String secondFileName = scanner.nextLine();
        FileReader fileReader = new FileReader(firstFileName);
        FileReader fileReader1 = new FileReader(secondFileName);
        FileWriter fileWriter = new FileWriter(firstFileName);
        int line = fileReader.read();
        int line1 = fileReader1.read();
        while (line1 != -1) {
            fileWriter.write(line1);
            line1 = fileReader1.read();
        }
        while (line != -1) {
            fileWriter.write(line);
            line = fileReader.read();
        }
        scanner.close();
        fileReader.close();
        fileReader1.close();
        fileWriter.close();
    }
}
