package com.javarush.task.pro.task09.task0908;


/* 
Двоично-шестнадцатеричный конвертер
*/

public class Solution {
    private static final String HEX = "0123456789abcdef";
    private static final String[] binary = new String[]{"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};


    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        StringBuilder Hexadecimal = new StringBuilder();
        if (binaryNumber == null) {
            return Hexadecimal.toString();
        }
        for (int i = 0; i < binaryNumber.length(); i++) {
            char symbol = binaryNumber.charAt(i);
            if (!(symbol == '0' || symbol == '1')) {
                return Hexadecimal.toString();
            }
        }

        if (binaryNumber.length() % 4 != 0) {
            StringBuilder binaryNumberBuilder = new StringBuilder(binaryNumber);
            for (int i = 0; i < binaryNumberBuilder.length() % 4; i++) {
                binaryNumberBuilder.insert(0, "0");
            }
            binaryNumber = binaryNumberBuilder.toString();
        }

        int i;
        int j = 4;
        for (i = 0; i < binaryNumber.length(); ) {
            String discharge = binaryNumber.substring(i, j);

            for (int k = 0; k < binary.length; k++) {
                if (binary[k].equals(discharge)) {
                    Hexadecimal.append(HEX.charAt(k));
                    break;
                }
            }
            i += 4;
            j += 4;
        }
        return Hexadecimal.toString();
    }

    public static String toBinary(String hexNumber) {
        //напишите тут ваш код
        StringBuilder bin = new StringBuilder();
        if (hexNumber == null) {
            return bin.toString();
        }
        for (int i = 0; i < hexNumber.length(); i++) {
            int check = HEX.indexOf(hexNumber.charAt(i));
            if (check == -1) {
                return bin.toString();
            }
        }
        for (int i = 0; i < hexNumber.length(); i++) {
            int index = HEX.indexOf(hexNumber.charAt(i));
            bin.append(binary[index]);
        }
        return bin.toString();
    }
}
