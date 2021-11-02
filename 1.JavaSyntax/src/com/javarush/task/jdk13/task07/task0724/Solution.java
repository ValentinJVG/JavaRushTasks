package com.javarush.task.jdk13.task07.task0724;

/* 
Семья
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human mihail = new Human("Михаил", true,25);
        Human anna = new Human("Аня", false, 21);
        Human katja = new Human("Катя", false, 55);
        Human petja = new Human("Петя", true, 57);
        Human ivan = new Human("Иван", true,3, anna, mihail);
        Human igor = new Human("Игорь", true, 2, anna, mihail);
        Human vasja = new Human("Вася",true, 25, katja, petja);
        Human kolja = new Human("Коля", true, 30, katja, petja);
        Human olja = new Human("Оля", false, 25, anna, mihail);

        System.out.println(mihail);
        System.out.println(anna);
        System.out.println(kolja);
        System.out.println(katja);
        System.out.println(petja);
        System.out.println(ivan);
        System.out.println(igor);
        System.out.println(vasja);
        System.out.println(olja);



    }

    public static class Human {
        // напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human mother;
        Human father;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human mother, Human father) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.mother = mother;
            this.father = father;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}