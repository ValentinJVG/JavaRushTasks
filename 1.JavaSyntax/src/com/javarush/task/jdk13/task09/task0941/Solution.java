package com.javarush.task.jdk13.task09.task0941;

import java.sql.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

/* 
IPv6
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(map("2001:db8:11a3:9d7:1f34:8a2e:7a0:765d")));
    }

    public static String[] map(String ipv6) {
        //напишите тут ваш код
        StringTokenizer tokenizer = new StringTokenizer(ipv6, ":");
        String[] arrayOfTokens = new String[tokenizer.countTokens()];
        for (int i = 0; i < arrayOfTokens.length; i++)
            arrayOfTokens[i] = tokenizer.nextToken();

        return arrayOfTokens;

    }
}
