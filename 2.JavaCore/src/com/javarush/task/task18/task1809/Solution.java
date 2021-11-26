package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String firstFile = scanner.nextLine();
        String secondFile = scanner.nextLine();
        FileInputStream fileInputStream = new FileInputStream(firstFile);
        FileOutputStream fileOutputStream = new FileOutputStream(secondFile);
        List<Integer> input = new ArrayList<>();
        while(fileInputStream.available() > 0) {
            input.add(fileInputStream.read());
        }
        Collections.reverse(input);
        for (Integer bytes: input) {
            fileOutputStream.write(bytes);
        }

        scanner.close();
        fileInputStream.close();
        fileOutputStream.close();
    }
}
