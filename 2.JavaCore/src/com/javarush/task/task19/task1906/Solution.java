package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;


/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String firstFileName = bufferedReader.readLine();
        String secondFileName = bufferedReader.readLine();
        FileReader fileReader = new FileReader(firstFileName);
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (fileReader.ready()) {
            arrayList.add(fileReader.read());
        }
        FileWriter fileWriter = new FileWriter(secondFileName);
        for (int i = 1; i < arrayList.size(); i = i + 2) {
            fileWriter.write(arrayList.get(i));
        }

        bufferedReader.close();
        fileReader.close();
        fileWriter.close();
    }
}
