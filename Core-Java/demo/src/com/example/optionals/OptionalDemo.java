package com.example.optionals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

    public static void main(String... args) {
        Customer customer = new Customer(
            101,
            "Abdus Salam",
            "salaam.mbstu@gmail.com",
            Arrays.asList("01856817465", "01752391808")
        );

//        Optional<String> emailOptional = Optional.of(customer.getEmail());

        Optional<String> emailOptional1 =  Optional.ofNullable(customer.getEmail());

//        System.out.println(emailOptional);
        System.out.println(emailOptional1);
        System.out.println(emailOptional1.orElse("er17010@mbstu.ac.bd"));
        System.out.println(emailOptional1.orElseGet(() -> "er17010@mbstu.ac.bd"));

        /* 1. How to create an optional ? */
        Optional<String> optional1 = Optional.empty(); // Returns an empty Optional instance.
        Optional<String> optional2 = Optional.of("null"); // Returns an Optional with the present non-null value.
        Optional<String> optional3 = Optional.ofNullable(null); // Returns an Optional describing the specified value, in non-null, otherwise returns an empty Optional.

        List<Optional<String>> stringList = new ArrayList<>();

        stringList.add(null);
        stringList.add(null);
        stringList.add(null);
        stringList.add(null);

//        Optional<List<String>> optionalStringList = Optional.ofNullable(stringList);

        for (Optional<String> s : stringList) {
            System.out.println(s.orElse("Java"));
        }

    }

}
