package com.javarush.task.jdk13.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Слова в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> arrayList = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arrayList.add(scanner.nextLine());
        }
        arrayList.remove(2);
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            String s = arrayList.get(i);
            System.out.println(s);
        }
    }
}
