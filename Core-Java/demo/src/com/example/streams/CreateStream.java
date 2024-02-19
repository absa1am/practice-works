package com.example.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreateStream {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Abdus Salam");
        names.add("Ashik Mahmud");
        names.add("Sayeem Chowdhury");

        Stream<String> generated = Stream.generate(() -> "+");
        List<String> strings = generated.limit(10L).collect(Collectors.toList());

        System.out.println(strings);

        Stream<String> iterated = Stream.iterate("+", s -> s.length() <= 5, s -> s + "+");

        iterated.forEach(System.out::println);

        String[] letters = {"A", "B", "C", "D"};
        List<String> listLetters = IntStream.range(0, 10)
                .mapToObj(index -> letters[index % letters.length])
                .collect(Collectors.toList());

        System.out.println("listLetters = " + listLetters);
    }

}
