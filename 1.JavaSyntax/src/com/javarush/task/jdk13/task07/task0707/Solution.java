package com.javarush.task.jdk13.task07.task0707;

import java.util.ArrayList;

/* 
5 различных строк в списке
*/

public class Solution {
    
    public static ArrayList<String> list;
    
    public static void main(String[] args) {
        //напишите тут ваш код
        list = new ArrayList<String>();
        list.add("ff");
        list.add("dd");
        list.add("sd");
        list.add("kk");
        list.add("lll");
        System.out.println(list.size());
        for (String s : list) {
            System.out.println(s);
        }
    }
}
