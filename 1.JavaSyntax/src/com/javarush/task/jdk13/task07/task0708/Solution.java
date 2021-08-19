package com.javarush.task.jdk13.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Самое большое число
*/

public class Solution {

    private static ArrayList<Integer> integers = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int maxInput = Integer.MIN_VALUE;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            integers.add(scanner.nextInt());
            if (integers.get(i) > maxInput) {
                maxInput = integers.get(i);
            }
        }
        System.out.println(maxInput);
    }
}
