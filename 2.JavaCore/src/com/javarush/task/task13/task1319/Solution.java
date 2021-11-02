package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.Scanner;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));

        StringBuilder builder = new StringBuilder();
        String string = "";
        while (!string.equals("exit")) {
            string = scanner.nextLine();
            builder.append(string).append("\n");
        }
        bufferedWriter.write(builder.toString());
        bufferedWriter.close();



    }
}
