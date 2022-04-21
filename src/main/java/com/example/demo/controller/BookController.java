package com.example.demo.controller;

import com.example.demo.controller.model.Book;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class BookController {


    ArrayList<Book> bookArrayList=new ArrayList<>();

    //1. Create = add

    @RequestMapping("/add_books")
    public String add(){
        Book book=new Book("Swami vivekanad",350,150);
        Book book1=new Book("Can't hurt me",250,200);
        Book book2=new Book("Ramayan",1200,400);
        Book book3=new Book("Mahabharat",3500,2200);
        Book book4=new Book("Tha Magic Of Thinking Big",240,140);
        bookArrayList.add(book);
        bookArrayList.add(book1);
        bookArrayList.add(book2);
        bookArrayList.add(book3);
        bookArrayList.add(book4);

        return "books added successfully";
    }

    //2.Read = Get

    @RequestMapping("/get_bookslist")
    public ArrayList<Book> getBookArrayList() {
        return bookArrayList;


    }

    //3.Update

    @RequestMapping("/update_book")
    public String update(){
        bookArrayList.get(2).setName("Geeta");
        bookArrayList.get(2).setPages(460);
        bookArrayList.get(2).setPrice(250);

        bookArrayList.get(0).setPages(300);

        return "books updated successfully";
    }


    //4. Delete

    @RequestMapping("/delete_book")
    public String delete(){
        bookArrayList.remove(3);
        return "book deleted successfully";
    }
}
