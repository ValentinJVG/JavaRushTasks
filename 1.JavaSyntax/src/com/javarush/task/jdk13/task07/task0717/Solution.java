package com.javarush.task.jdk13.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Удвой слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Считать строки с консоли и объявить ArrayList list тут
        ArrayList<String> list = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            list.add(scanner.nextLine());
        }
        ArrayList<String> result = doubleValues(list);
        assert result != null;
        for (String s: result) {
            System.out.println(s);
        }

        // Вывести на экран result
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        //напишите тут ваш код
        ArrayList<String> result = new ArrayList<>();
        for (String s: list) {
            result.add(s);
            result.add(s);
        }
        return result;
    }
}
