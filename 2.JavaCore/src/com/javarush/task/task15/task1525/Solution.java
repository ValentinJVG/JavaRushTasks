package com.javarush.task.task15.task1525;

import jdk.jfr.events.FileReadEvent;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static {
        String inputFile;
        try {
            FileReader fileReader = new FileReader(Statics.FILE_NAME);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((inputFile = bufferedReader.readLine()) != null) {
               lines.add(inputFile);
            }
            fileReader.close();
            bufferedReader.close();

        }  catch (FileNotFoundException fileNotFoundException) {
            System.out.println(fileNotFoundException);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        System.out.println(lines);
    }

}
