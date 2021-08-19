package com.javarush.task.jdk13.task07.task0710;

import java.util.ArrayList;
import java.util.Scanner;

/* 
10 строчек в начало списка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = scanner.nextLine();
            arrayList.add(0, s);
        }
        for (String s : arrayList) {
            System.out.println(s);
        }
    }
}
