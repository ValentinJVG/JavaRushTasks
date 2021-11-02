package com.javarush.task.jdk13.task08.task0824;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Вся семья в сборе
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        Human son = new Human("Jake", true, 6);
        Human daughter = new Human("Janine", false, 8);
        Human youngestSon = new Human("Josef", true, 4);

        Human father = new Human("John", true, 33, son, daughter, youngestSon);
        Human mother = new Human("Jane", false, 30, son, daughter, youngestSon);



        Human hisFather = new Human("Jacob", true, 65, father);
        Human herFather = new Human("Jason", true,63, mother);
        Human hisMother = new Human("Joanne", false,59, father);
        Human herMother = new Human("Jessy", false, 56, mother);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(daughter);
        System.out.println(son);
        System.out.println(youngestSon);
        System.out.println(hisFather);
        System.out.println(herFather);
        System.out.println(hisMother);
        System.out.println(herMother);
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human... children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            Collections.addAll(this.children, children);
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
