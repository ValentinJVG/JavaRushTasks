package com.javarush.task.task19.task1926;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Перевертыши
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file = new BufferedReader(new FileReader(bufferedReader.readLine()));
        while (file.ready()) {
            String line = file.readLine();
            System.out.println(new StringBuffer(line).reverse());
        }
bufferedReader.close();
        file.close();
    }
}
