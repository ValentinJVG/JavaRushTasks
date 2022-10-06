package com.javarush.task.task18.task1828;

public class Product {
    int id;
    String productName;
    String price;
    String quantity;

    public Product(int id, String productName, String price, String quantity) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public static Product getProduct(String s) {
        String id = s.substring(0, 8).trim();
        String name = s.substring(8, 38).trim();
        String price = s.substring(38, 46).trim();
        String quantity = s.substring(46, 50).trim();
        return new Product (Integer.parseInt(id), name, price, quantity);
    }
}
