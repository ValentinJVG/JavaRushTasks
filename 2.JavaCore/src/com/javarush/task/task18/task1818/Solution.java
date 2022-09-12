package com.javarush.task.task18.task1818;

import java.io.*;
import java.util.Scanner;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String firstFile = scanner.nextLine();
        String secondFile = scanner.nextLine();
        String thirdFile = scanner.nextLine();
        FileWriter fileWriter = new FileWriter(firstFile);
        FileReader fileReader = new FileReader(secondFile);
        FileReader fileReader1 = new FileReader(thirdFile);
        int line = fileReader.read();
        int line1 = fileReader1.read();
        while (line != -1) {
            fileWriter.write(line);
            line = fileReader.read();
        }
        while (line1 != -1) {
            fileWriter.write(line1);
            line1 = fileReader1.read();
        }
        fileReader.close();
        fileReader1.close();
        fileWriter.close();
        scanner.close();
    }
}
