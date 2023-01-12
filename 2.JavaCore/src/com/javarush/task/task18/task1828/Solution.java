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

        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
            while (fileReader.ready()) {
                Product product = Product.getProduct(fileReader.readLine());
                productList.add(product);
            }
        }
        switch (args[0]) {
            case "-u": {
                int id = Integer.parseInt(args[1]);
                StringBuilder name = new StringBuilder();
                for (int i = 2; i < args.length - 2; i++) {
                    name.append(args[i]).append(" ");
                }
                if (name.length() > 30) {
                    name = new StringBuilder(name.substring(0, 30));
                }
                String price = args[args.length - 2];
                if (price.length() > 8) {
                    price = price.substring(0, 8);
                }
                String quantity = args[args.length - 1];
                if (quantity.length() > 4) {
                    quantity = quantity.substring(0, 4);
                }
                Product productToUpdate = null;
                for (Product product : productList) {
                    if (product.id == id) productToUpdate = product;
                }
                if (productToUpdate != null) {
                    productToUpdate.productName = name.toString();
                    productToUpdate.price = price;
                    productToUpdate.quantity = quantity;
                }
                break;
            }
            case "-d": {
                int id = Integer.parseInt(args[1]);
                Product productToDelete = null;
                for (Product product : productList) {
                    if (product.id == id) productToDelete = product;
                }
                if (productToDelete != null) productList.remove(productToDelete);
                break;
            }
        }

        try (FileWriter fileWriter = new FileWriter(fileName)) {
            for (Product product : productList) {
                fileWriter.write(product.toString());
                fileWriter.write("\n");
            }
        }
    }
}
