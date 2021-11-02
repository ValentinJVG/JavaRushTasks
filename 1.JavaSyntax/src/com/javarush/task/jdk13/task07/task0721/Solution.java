package com.javarush.task.jdk13.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Максимальное и минимальное числа в массиве
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int maximum;
        int minimum;

        //напишите тут ваш код
        maximum = Integer.MIN_VALUE;
        minimum = Integer.MAX_VALUE;

        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            if (array[i] > maximum) {
                maximum = array[i];
            }
            if (array[i] < minimum) {
                minimum = array[i];
            }
        }
        System.out.print(maximum + " " + minimum);
    }
}
