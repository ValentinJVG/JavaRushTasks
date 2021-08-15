package com.javarush.task.jdk13.task12.task1203;

/* 
Сознательный выбор
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(isByte(12)); // true
        System.out.println(isShort(130999)); // false
        System.out.println(isInt(1999939990L)); // true
        System.out.println(isInt(19999999939990L)); // false
    }

    public static boolean isByte(long l) {
        return l <= Byte.MAX_VALUE && l >= Byte.MIN_VALUE ;
        //напишите тут ваш код

    }

    public static boolean isShort(long l) {
        //напишите тут ваш код
        return l <= Short.MAX_VALUE && l >= Short.MIN_VALUE;
    }

    public static boolean isInt(long l) {
        //напишите тут ваш код
        return l <= Integer.MAX_VALUE && l >= Integer.MIN_VALUE;
    }
}
