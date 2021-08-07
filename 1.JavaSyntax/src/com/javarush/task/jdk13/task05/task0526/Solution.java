package com.javarush.task.jdk13.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {

    public static class Man {
        private String name, address;
        private int age;

        public Man(String name, int age, String address) {
            this.name = name;
            this.address = address;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    public static class Woman {
        private String name, address;
        private int age;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.address = address;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        Man man = new Man("John", 56, "some address");
        Man man1 = new Man("unknown", 67, "unknown");
        Woman women = new Woman("Jane", 45, "Visteria lane");
        Woman women1 = new Woman("Jane Doe", 44, "unknown");

        System.out.println(man.name + " " + man.age + " " + man.address);
        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(women.name + " " + women.age + " " + women.address);
        System.out.println(women1.name + " " + women1.age + " " + women1.address);
    }


    //напишите тут ваш код
}
