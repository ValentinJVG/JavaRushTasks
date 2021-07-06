package com.javarush.task.jdk13.task08.task0831;

import java.util.Arrays;

/* 
Любимые настолки
*/

public class Solution {

    public static BoardGame[] collection = new BoardGame[5];

    public static void main(String[] args) {
        BoardGame chess = new BoardGame();
        BoardGame monopoly = new BoardGame();
        BoardGame go = new BoardGame();
        BoardGame trainToTravel = new BoardGame();
        BoardGame allias = new BoardGame();

        chess.name = "Шахматы";
        monopoly.name = "Монополия";
        go.name = "Го";
        trainToTravel.name = "Train to travel";
        allias.name = "Allias";
        collection[0] = chess;
        collection[1] = monopoly;
        collection[2] = go;
        collection[3] = trainToTravel;
        collection[4] = allias;

        //напишите тут ваш код
        System.out.println(Arrays.toString(collection));
    }
}