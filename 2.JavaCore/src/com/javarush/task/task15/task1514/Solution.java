package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(3.2, "zzzzz");
        labels.put(7.6, "kkkkkkk");
        labels.put(2.2, "2");
        labels.put(3.0, "3");
        labels.put(4.4, "4");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
