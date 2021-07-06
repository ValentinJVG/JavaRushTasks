package com.javarush.task.jdk13.task02.task0213;

/* 
У каждого животного должна быть хозяйка
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Cat maks = new Cat();
        Fish goldFish = new Fish();
        Dog dog = new Dog();
        Woman woman = new Woman();
        maks.owner = woman;
        goldFish.owner = woman;
        dog.owner = woman;

    }

    public static class Cat {
        public Woman owner;
    }

    public static class Dog {
        public Woman owner;
    }

    public static class Fish {
        public Woman owner;
    }

    public static class Woman {
    }
}
