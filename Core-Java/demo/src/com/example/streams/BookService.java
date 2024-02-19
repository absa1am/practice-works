package com.example.streams;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BookService {

    public List<Book> getBooksInSort() {
        List<Book> books = new BookDAO().getBooks();

        Collections.sort(books , (o1, o2) -> o1.getName().compareTo(o2.getName()));

        return books;
    }

    public List<Book> getAll() {
        return Stream.of(
            new Book(1, "Effective Java", 500),
            new Book(2, "Clean Code", 500),
            new Book(3, "Head First Design Pattern", 600)
        ).collect(Collectors.toList());
    }

}

/*
class MyComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o2.getName().compareTo(o1.getName());
    }

}
*/