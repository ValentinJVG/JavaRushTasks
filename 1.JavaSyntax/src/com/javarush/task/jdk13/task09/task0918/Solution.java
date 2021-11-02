package com.javarush.task.jdk13.task09.task0918;

/* 
Создаем свои исключения
*/

public class Solution {
    public static void main(String[] args) {
    }

    static class MyException extends Throwable {
    }

    static class MyException2 extends ClassNotFoundException {
    }

    static class MyException3 extends RuntimeException {
    }

    static class MyException4 extends IllegalStateException {
    }
}
