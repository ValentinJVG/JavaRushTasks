package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();

        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            int i;
            while ((i = fileInputStream.read()) != -1) {
                System.out.print((char)i);
            }
            scanner.close();
            fileInputStream.close();
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

    }
}