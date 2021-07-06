package com.javarush.task.pro.task05.task0511;

import java.util.Scanner;

/* 
Создаем двухмерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n > 0) {
            multiArray = new int[n][];
            for (int i = 0; i < n; i++) {
                int anotherN = scanner.nextInt();
                if (anotherN > 0) {
                    multiArray[i] = new int[anotherN];
                }
            }
        }
        scanner.close();
    }
}
