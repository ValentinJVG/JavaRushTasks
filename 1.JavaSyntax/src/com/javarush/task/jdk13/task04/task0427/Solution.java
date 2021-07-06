package com.javarush.task.jdk13.task04.task0427;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Строка - описание
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
    String number = reader.readLine ();
    int myNumber = Integer.parseInt (number);
    if (myNumber < 1 || myNumber > 999) {

    }
       else if (myNumber % 2 == 0 && myNumber <= 9){
            System.out.println("четное однозначное число");}
        else if (myNumber % 2 != 0 && myNumber <= 9){
            System.out.println("нечетное однозначное число");}
        else if (myNumber % 2 == 0 && myNumber >= 10 && myNumber <= 99){
            System.out.println("четное двузначное число");}
        else if (myNumber % 2 != 0 && myNumber >= 10 && myNumber <= 99){
            System.out.println("нечетное двузначное число");}
        else if (myNumber % 2 == 0 && myNumber >= 100 && myNumber <= 999){
            System.out.println("четное трехзначное число");}
        else if (myNumber % 2 != 0 && myNumber >= 99 && myNumber <= 999){
            System.out.println("нечетное трехзначное число");}
    

    }
}
