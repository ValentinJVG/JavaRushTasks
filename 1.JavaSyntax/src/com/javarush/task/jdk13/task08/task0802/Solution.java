package com.javarush.task.jdk13.task08.task0802;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Map из 10 пар
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("арбуз", "ягода");
        stringMap.put("банан", "трава");
        stringMap.put("вишня", "ягода");
        stringMap.put("груша", "фрукт");
        stringMap.put("дыня", "овощ");
        stringMap.put("ежевика", "куст");
        stringMap.put("жень-шень", "корень");
        stringMap.put("земляника", "ягода");
        stringMap.put("ирис", "цветок");
        stringMap.put("картофель", "клубень");

        for (Map.Entry<String, String> pair: stringMap.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " - " + value);
        }
    }
}
