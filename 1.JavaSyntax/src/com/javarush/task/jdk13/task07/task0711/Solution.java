package com.javarush.task.jdk13.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Удали последнюю строку и вставь её в начало
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList <String> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            String s = scanner.nextLine();
            arrayList.add(s);
        }
        for (int i = 0; i < 13; i++) {
            String s = arrayList.remove(4);
            arrayList.add(0, s);
        }

        for (String string : arrayList) {
            System.out.println(string);
        }
    }
}
