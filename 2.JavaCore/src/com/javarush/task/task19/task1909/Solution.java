package com.javarush.task.task19.task1909;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Замена знаков
*/

public class Solution {


    public static void main(String[] args) throws IOException {
        String inputFileName;
        String outputFileName;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            inputFileName = bufferedReader.readLine();
            outputFileName = bufferedReader.readLine();
        }
        ArrayList<String> fileContent = new ArrayList<>();
        try (BufferedReader inputFileReader = new BufferedReader(new FileReader(inputFileName))) {
            while (inputFileReader.ready()) {
                fileContent.add(inputFileReader.readLine());
            }
        }

        try (BufferedWriter outputFileWriter = new BufferedWriter(new FileWriter(outputFileName))) {
for (String content: fileContent) {
    outputFileWriter.write(content.replaceAll("\\.", "!"));
}
        }

    }
}
