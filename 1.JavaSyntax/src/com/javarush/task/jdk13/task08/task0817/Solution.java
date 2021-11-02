package com.javarush.task.jdk13.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Удалить людей, имеющих одинаковые имена
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

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map<String, String> copy = new HashMap<>(map);

        for (String name : copy.values()) {
            int count = 0;
            for (String nameTmp : map.values()) {
                if (nameTmp.equals(name)) {
                    count++;
                }
            }
            if (count > 1) {
                removeItemFromMapByValue(map, name);
            }
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
