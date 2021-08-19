package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {



    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private int age, weight, height;
        private String name, lastName, address;

        public Human() {
        }

        public Human(int age, int weight, int height, String name, String lastName, String address) {
            this.age = age;
            this.weight = weight;
            this.height = height;
            this.name = name;
            this.lastName = lastName;
            this.address = address;
        }

        public Human(int age, int weight, int height, String name, String lastName) {
            this.age = age;
            this.weight = weight;
            this.height = height;
            this.name = name;
            this.lastName = lastName;
        }

        public Human(int age, int weight, int height, String name) {
            this.age = age;
            this.weight = weight;
            this.height = height;
            this.name = name;
        }

        public Human(int age, int weight, int height) {
            this.age = age;
            this.weight = weight;
            this.height = height;
        }

        public Human(int age, int weight) {
            this.age = age;
            this.weight = weight;
        }

        public Human(int age) {
            this.age = age;
        }

        public Human(String address) {
            this.address = address;
        }

        public Human (int height, String name) {
            this.height = height;
            this.name = name;
        }

        public Human (String lastName, int age) {
            this.lastName = lastName;
            this.age = age;
        }
    }
}
