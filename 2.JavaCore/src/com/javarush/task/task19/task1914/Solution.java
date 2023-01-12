package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream printStream = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(byteArrayOutputStream));
        testString.printSomething();
        System.setOut(printStream);
        
        String result = byteArrayOutputStream.toString();
        String[] array = result.split(" ");
        int firstNumber = Integer.parseInt(array[0]);
        int secondNumber = Integer.parseInt(array[2]);
        int result1 = 0;
        switch (array[1].trim()) {
            case "+":
                result1 = firstNumber + secondNumber;
                break;
            case "-":
                result1 = firstNumber - secondNumber;
                break;
            case "*":
                result1 = firstNumber * secondNumber;
                break;
        }
        System.out.println(firstNumber + " " + array[1] + " " + secondNumber + " = " + result1);
        
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

