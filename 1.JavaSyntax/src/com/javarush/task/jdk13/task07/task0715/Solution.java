package com.javarush.task.jdk13.task07.task0715;

import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("мама");
        arrayList.add("мыла");
        arrayList.add("раму");
        arrayList.add(1,"именно");
        arrayList.add(3,"именно");
        arrayList.add(5,"именно");

        for (String s: arrayList) {
            System.out.println(s);
        }
    }
}
