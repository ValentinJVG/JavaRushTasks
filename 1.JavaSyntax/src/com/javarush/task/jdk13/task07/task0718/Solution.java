package com.javarush.task.jdk13.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Сортировка списка
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(scanner.nextLine());
        }
        String current = arrayList.get(0);
        for (int i = 0; i < 10; i++) {
            if (arrayList.get(i).length() >= current.length()) {
                current = arrayList.get(i);
            } else {
                System.out.println(i);
                break;
            }
        }
    }
}

