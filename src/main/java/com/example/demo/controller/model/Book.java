package com.example.demo.controller.model;

import lombok.Data;

@Data
public class Book {

    String name;
    int pages;
    int price;

    public Book(String name, int pages, int price) {
        this.name = name;
        this.pages = pages;
        this.price = price;
    }
}
