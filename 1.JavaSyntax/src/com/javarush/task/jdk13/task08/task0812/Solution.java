package com.javarush.task.jdk13.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Cамая длинная последовательность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            integerArrayList.add(scanner.nextInt());
        }
        int count = 1;
        int maxInARow = 1;
        for (int i = 0; i < 9; i++) {
            if (integerArrayList.get(i).equals(integerArrayList.get(i + 1))) {
                maxInARow++;
            } else if (maxInARow > count) {
                count = maxInARow;
                maxInARow = 1;
            } else {
                maxInARow = 1;
            }
        }
        if (maxInARow > count) {
            count = maxInARow;
        }
        System.out.println(count);
    }
}
