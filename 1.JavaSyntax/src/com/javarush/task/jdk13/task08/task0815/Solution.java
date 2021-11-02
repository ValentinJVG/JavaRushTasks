package com.javarush.task.jdk13.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Одинаковые имя и фамилия
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("John", "as");
        map.put("Peter", "sd");
        map.put("Jane", "sdf");
        map.put("O", "asd");
        map.put("F", "dfgh");
        map.put("G", "kjh");
        map.put("d", "bvbv");
        map.put("wewq", "sjdfsdf");
        map.put("Dfgg", "kalk");
        map.put("Das", "jshjl");
        return map;

    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count = 0;
        for (String nameTmp : map.values()) {
            if (nameTmp.equals(name)) {
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count = 0;
        for (String lastNameTmp : map.keySet()) {
            if (lastNameTmp.equals(lastName)) {
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {

    }
}
