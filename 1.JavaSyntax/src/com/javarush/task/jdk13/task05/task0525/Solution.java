package com.javarush.task.jdk13.task05.task0525;

/* 
И целой утки мало
2. Создай класс Dog(собака).
3. У класса Cat должен быть верно реализован метод toString.
4. У класса Dog должен быть верно реализован метод toString.
5. В методе main создай два объекта типа Cat.
6. В методе main создай два объекта типа Dog.
7. Выведи все созданные объекты на экран.
*/

public class Solution {

    public static void main(String[] args) {
        Duck duck1 = new Duck();
        Duck duck2 = new Duck();
        Cat cat = new Cat();
        Cat cat1 = new Cat();
        Dog dog = new Dog();
        Dog dog1 = new Dog();
        System.out.println(duck1);
        System.out.println(duck2);
        System.out.println(cat);
        System.out.println(cat1);
        System.out.println(dog);
        System.out.println(dog1);

        //напишите тут ваш код
    }

    public static class Duck {
        public String toString() {
            return "Duck";
        }
    }

    public static class Cat {
        public String toString() {
            return "Cat";
        }
    }

    public static class Dog {
        public String toString() {
            return "Dog";
        }
    }

    //напишите тут ваш код
}
