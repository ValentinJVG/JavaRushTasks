package com.javarush.task.task18.task1810;

import java.io.*;
import java.util.Scanner;

/* 
DownloadException
*/

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            String fileName = scanner.nextLine();
            FileInputStream fileInputStream = new FileInputStream(fileName);
            if (fileInputStream.available() < 1000) {
                throw new DownloadException();
            }
        }


    }

    public static class DownloadException extends Exception {

    }
}
