package com.javarush.task.jdk13.task05.task0528;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

/* 
Вывести на экран сегодняшнюю дату
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
        System.out.println(dateFormat.format(date));


    }
}
