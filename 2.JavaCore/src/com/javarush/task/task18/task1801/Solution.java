package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        int maxByte = Byte.MIN_VALUE;

        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            while (fileInputStream.available() > 0) {
                int currentByte = fileInputStream.read();
                if (currentByte > maxByte) {
                    maxByte = currentByte;
                }
            }
            System.out.println(maxByte);
            scanner.close();
        }
    }
}
