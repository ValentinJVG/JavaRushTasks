package com.javarush.task.jdk13.task09.task0926;

import java.util.ArrayList;
import java.util.Arrays;

/* 
Список из массивов чисел
*/

public class Solution {

    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> arrayList = new ArrayList<>();
        arrayList.add(new int[]{1, 2, 3, 5, 6});
        arrayList.add(new int[]{5, 8});
        arrayList.add(new int[]{123, 789, 5, 6});
        arrayList.add(new int[]{753, 159, 456, 489, 465, 165, 495});
        arrayList.add(new int[]{});

        return arrayList;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            System.out.println(Arrays.toString(array));
        }
    }
}
