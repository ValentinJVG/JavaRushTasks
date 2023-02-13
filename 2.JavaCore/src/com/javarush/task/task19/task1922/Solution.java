package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
String fileRead = bufferedReader.readLine();
BufferedReader read = new BufferedReader(new FileReader(fileRead));
while (read.ready()) {
    String readString = read.readLine();
    String[] stringToSplit = readString.split(" ");
    int wordCount = 0;
    for (int i = 0; i < stringToSplit.length; i++) {
        if (words.contains(stringToSplit[i])) {
            wordCount++;
        }
    }
    if (wordCount == 2) {
        System.out.println(readString);
    }
}
bufferedReader.close();
read.close();
    }
}
