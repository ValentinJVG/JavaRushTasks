package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println(maxCommonDivider());
    }

    public static int maxCommonDivider() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a == 0)
            return b;

        while (b != 0) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
}


