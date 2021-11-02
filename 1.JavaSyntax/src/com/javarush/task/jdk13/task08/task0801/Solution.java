package com.javarush.task.jdk13.task08.task0801;

import java.util.HashSet;
import java.util.Set;

/* 
Set из растений
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
Set<String> stringSet = new HashSet<>();
stringSet.add("арбуз");
stringSet.add("банан");
stringSet.add("вишня");
stringSet.add("груша");
stringSet.add("дыня");
stringSet.add("ежевика");
stringSet.add("женьшень");
stringSet.add("земляника");
stringSet.add("ирис");
stringSet.add("картофель");

for (String s: stringSet) {
    System.out.println(s);
}
    }
}
