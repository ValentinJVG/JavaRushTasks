package com.javarush.task.jdk13.task09.task0938;

/* 
Двоичная кодировка
*/

public class Solution {

    public static void main(String[] args) {
        String string = "JavaRush";
        char[] charArray = string.toCharArray();
        for (char c : charArray) {
            print(c);
        }
    }

    private static void print(int number) {
        String result = String.format("Номер символа %s в таблице Unicode - %d, а в двоичной системе - %s", (char) number, number, toBinary(number));
        System.out.println(result);
    }

    public static String toBinary(int number) {
        //напишите тут ваш код
        String result = "";
        while (number != 0) {
            result = number % 2 + result;
            number /= 2;
        }
        return result;
    }
}
