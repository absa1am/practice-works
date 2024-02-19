package com.example.streams;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String... args) {
        List<String> os = new ArrayList<>();

        os.add("Windows");
        os.add("Linux");
        os.add("Mac");
        os.add("Unix");

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Windows");
        map.put(2, "Linux");
        map.put(3, "Unix");
        map.put(4, "Mac");

        Predicate<String> predicate = s -> s.contains("x");
        Consumer<String> consumer = s -> System.out.println(s);

        System.out.println("-----------------------------");

        for (String s : os) {
            if (predicate.test(s))
                consumer.accept(s);
        }

        System.out.println("-----------------------------");

        os.stream()
                .filter(predicate)
                .forEach(consumer);

        System.out.println("-----------------------------");

        Predicate<Map.Entry<Integer, String>> predicate1 = e -> e.getValue().contains("x");
        Consumer<Map.Entry<Integer, String>> consumer1 = e -> System.out.println(e.getKey() + ": " + e.getValue());

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (predicate1.test(entry))
                consumer1.accept(entry);
        }

        System.out.println("-----------------------------");

        map.entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getKey() - e1.getKey())
                .filter(predicate1)
                .forEach(consumer1);

        System.out.println("-----------------------------");

        List<Book> books = new BookService().getBooksInSort();

        Predicate<Book> predicate2 = book -> book.getPages() <= 200;
        Consumer<Book> consumer2 = book -> System.out.println(book);

        for (Book book : books) {
            if (predicate2.test(book))
                consumer2.accept(book);
        }

        System.out.println("-----------------------------");

        books.stream()
                .filter(predicate2)
                .sorted(Comparator.comparing(Book::getName).reversed())
                .forEach(System.out::println);

        System.out.println("-----------------------------");

        List<Book> booksList = new BookService().getAll();

        booksList.stream()
                .map(book -> book.getName())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("-----------------------------");

        List<String> activeNumbers = new ArrayList<>();
        List<String> inactiveNumbers = new ArrayList<>();

        activeNumbers.add("01856817465");
        activeNumbers.add("01752391808");
        inactiveNumbers.add("01850639615");

        List<List<String>> phoneNumbers = new ArrayList<>();

        phoneNumbers.add(activeNumbers);
        phoneNumbers.add(inactiveNumbers);

        System.out.println(phoneNumbers);

        phoneNumbers.stream()
                .flatMap(n -> n.stream())
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

}
