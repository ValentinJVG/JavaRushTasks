package com.javarush.task.pro.task09.task0908;

import java.util.regex.Pattern;

/* 
Двоично-шестнадцатеричный конвертер
*/

public class Solution {

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        //напишите тут ваш код
        String hexToReturn;
        if (!binaryNumber.contains("0") || !binaryNumber.contains("1") || binaryNumber == null) {
            return null;
        } else {
            int toInteger = Integer.parseInt(binaryNumber);
            hexToReturn = Integer.toHexString(toInteger);
        }
        return hexToReturn;
    }

    public static String toBinary(String hexNumber) {
        //напишите тут ваш код
        String binaryToReturn = "";
        if (!hexNumber.contains("1234567890abcdef")){
            return null;
        } else {
            int toInteger = Integer.parseInt(hexNumber);
            binaryToReturn = Integer.toBinaryString(toInteger);
        } return binaryToReturn;
    }
}
