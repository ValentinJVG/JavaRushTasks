package com.javarush.task.jdk13.task08.task0820;

import java.util.HashSet;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static class Cat {

    }

    public static class Dog {

    }
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<Cat>();
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());

        //напишите тут ваш код

        return result;
    }

    public static Set<Dog> createDogs() {
        //напишите тут ваш код
        Set<Dog> result = new HashSet<Dog>();
        result.add(new Dog());
        result.add(new Dog());
        result.add(new Dog());
        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
        Set<Object> set = new HashSet<>();
        set.addAll(cats);
        set.addAll(dogs);
        return set;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
        Set<Object> set = new HashSet<>();
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        for (Object object: pets) {
            System.out.println(pets);
        }
    }

    //напишите тут ваш код
}
