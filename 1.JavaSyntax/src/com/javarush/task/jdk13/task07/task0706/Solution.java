package com.javarush.task.jdk13.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Улица и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int[] street = new int[15];
        Scanner scanner = new Scanner(System.in);
        int evenHouseNumber = 0;
        int oddHouseNumber = 0;

        for (int i = 0; i < street.length; i++) {
            street[i] = scanner.nextInt();
            if (i % 2 == 0) {
                evenHouseNumber += street[i];
            } else {
                oddHouseNumber += street[i];
            }
        }
        if (evenHouseNumber > oddHouseNumber) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        } else {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}