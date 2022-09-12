package com.javarush.task.task18.task1824;

import java.io.*;
import java.util.Scanner;

/* 
Файлы и исключения
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String newFile = scanner.nextLine();
            try (FileReader reader = new FileReader(newFile)) {

            } catch (FileNotFoundException fileNotFoundException) {
                System.out.println(newFile);
                break;
            }
        }
    }
}
