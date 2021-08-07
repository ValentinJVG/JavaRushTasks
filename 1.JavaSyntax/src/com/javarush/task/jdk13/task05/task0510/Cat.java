package com.javarush.task.jdk13.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    String name, address, color;
    int age, weight;

    public void initialize(String name) {
        this.name = name;
        this.color = "grey";
        this.age = 2;
        this.weight = 2;
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.color = "black";
        this.age = age;
        this.weight = weight;
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.color = "white";
        this.age = age;
        this.weight = 5;
    }

    public void initialize(int weight, String color) {
        this.color = color;
        this.age = 2;
        this.weight = weight;
    }

    public void initialize(int weight, String color, String address) {
        this.address = address;
        this.color = color;
        this.age = 3;
        this.weight = weight;
    }
    public static void main(String[] args) {

    }
}
