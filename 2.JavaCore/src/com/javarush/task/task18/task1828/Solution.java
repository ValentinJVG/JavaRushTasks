package com.javarush.task.task18.task1828;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Прайсы 2
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        ArrayList<Product> productList = new ArrayList<>();

        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))){
            while (fileReader.ready()) {
                Product product = Product.getProduct(fileReader.readLine());
                productList.add(product);
            }
        }
        switch (args[0]) {
            case "-u":{

            }
        }
    }
}
