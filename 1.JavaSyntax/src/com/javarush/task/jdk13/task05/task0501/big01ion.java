package com.javarush.task.jdk13.task05.task0501;

/* 
Кошачья бойня(1)
*/

class Solution1 {
    public static void main(String[] args) {
        Cat maks = new Cat("Maks", 5, 6, 90);
        Cat kuzja = new Cat("Kuzja", 4, 5, 90);
        Cat dvorovyi = new Cat("Blohastyi", 3, 4,89);
        System.out.println(maks.fight(kuzja));
        System.out.println(kuzja.fight(dvorovyi));
        System.out.println(maks.fight(dvorovyi));

    }

    public static class Cat {
        //напишите тут ваш код
       private String name;
       private int age, weight, strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

       public boolean fight(Cat anotherCat) {
               int ageScore = Integer.compare(this.age, anotherCat.age);
               int weightScore = Integer.compare(this.weight, anotherCat.weight);
               int strengthScore = Integer.compare(this.strength, anotherCat.strength);

               int score = ageScore + weightScore + strengthScore;
               return score > 0;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public int getStrength() {
            return strength;
        }

        public void setStrength(int strength) {
            this.strength = strength;
        }
    }
}