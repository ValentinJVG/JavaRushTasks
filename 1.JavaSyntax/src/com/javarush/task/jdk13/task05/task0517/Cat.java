package com.javarush.task.jdk13.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    //напишите тут ваш код

    //9. У класса должен быть конструктор, принимающий в качестве параметров вес, цвет и инициализирующий
    // все переменные класса, кроме имени и адреса.
    //10. У класса должен быть конструктор, принимающий в качестве параметров вес, цвет, адрес и инициализирующий все переменные класса, кроме имени.
    String name,address, color;
    int age, weight;

    public Cat(String name) {
        this.name = name;
        this.color = "black";
        this.age = 4;
        this.weight = 5;
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.color = "grey";
        this.age = age;
        this.weight = weight;
    }

    public Cat(String name, int age) {
        this.color = "bold";
        this.age = age;
        this.weight = 3;
        this.name = name;
    }

    public Cat(int weight, String color) {
        this.name = null;
        this.address = null;
        this.color = color;
        this.age = 5;
        this.weight = weight;
    }

    public Cat(int weight, String color, String address) {
        this.color = color;
        this.age = 3;
        this.address = address;
        this.weight = weight;
    }

    public static void main(String[] args) {

    }
}
