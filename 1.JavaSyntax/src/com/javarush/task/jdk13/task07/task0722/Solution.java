package com.javarush.task.jdk13.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        //напишите тут ваш код

        ArrayList<String> arrayList = new ArrayList<>();
        while (true) {
            String string = scanner.nextLine();
            if (string.equalsIgnoreCase("end")) {
                break;
            } else {
                arrayList.add(string);
            }

        }for (String s : arrayList)
            System.out.println(s);
    }
}