package com.javarush.task.jdk13.task02.task0209;

/* 
Три собаки - это сила
*/

public class Solution {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Max";

        //напишите тут ваш код
        Dog bella = new Dog();
        bella.name = "Bella";
        Dog jack = new Dog();
        jack.name = "Jack";
    }

    public static class Dog {
        public String name;
    }
}
