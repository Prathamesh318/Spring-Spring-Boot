package com.productmanagement.beans;

public class Product {
    int id;
     String name;
     Brand brand;

    public Product(int id, String name, Brand brand) {
        this.id = id;
        this.name = name;
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Brand getBrand() {
        return brand;
    }
}

