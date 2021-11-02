package com.javarush.task.jdk13.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Три массива
*/

public class Solution {

    public static ArrayList<Integer> numbers = new ArrayList<>();
    public static ArrayList<Integer> divBy3 = new ArrayList<>();
    public static ArrayList<Integer> divBy2 = new ArrayList<>();
    public static ArrayList<Integer> others = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            int input = scanner.nextInt();
            numbers.add(input);

            if (input % 3 == 0) {
                divBy3.add(input);
            }
            if (input % 2 == 0) {
                divBy2.add(input);

            } if (input % 2 != 0 && input % 3 != 0 ){
                others.add(input);
            }
        }
        printList(divBy3);
        printList(divBy2);
        printList(others);
    }


    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for (Integer s : list) {
            System.out.println(s);
        }
    }
}
