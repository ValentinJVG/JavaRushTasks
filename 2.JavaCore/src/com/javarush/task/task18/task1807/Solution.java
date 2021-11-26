package com.javarush.task.task18.task1807;

import java.io.*;
import java.util.Scanner;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        int count = 0;
        while(fileInputStream.available() > 0) {
            if (fileInputStream.read() == ',') {
                count++;
            }
        }
        System.out.println(count);
        fileInputStream.close();
        scanner.close();
    }
}
