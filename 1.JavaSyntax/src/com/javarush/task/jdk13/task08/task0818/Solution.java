package com.javarush.task.jdk13.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Налоговая и зарплаты
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> map = new HashMap<>();
        map.put("John", 700);
        map.put("Peter", 800);
        map.put("Jane", 700);
        map.put("O", 500);
        map.put("F", 200);
        map.put("G", 450);
        map.put("d", 350);
        map.put("wewq", 123);
        map.put("Dfgg", 1500);
        map.put("Das", 250);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Map<String, Integer> copy = new HashMap<>(map);
        for (Map.Entry<String, Integer> pair : copy.entrySet()) {
            if (pair.getValue() < 500) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}