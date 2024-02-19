package com.example.streams;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {

    public List<Book> getBooks() {
        List<Book> books = new ArrayList<>();

        books.add(new Book(101, "Core Java", 400));
        books.add(new Book(275, "Spring Boot", 200));
        books.add(new Book(363, "Hibernate", 180));
        books.add(new Book(893, "Spring Core", 500));

        return books;
    }

}
