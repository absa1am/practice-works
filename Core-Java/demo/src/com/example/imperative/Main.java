package com.example.imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Abdus Salam", Gender.MALE),
                new Person("Ashik Mahmud", Gender.MALE)
        );

        // Imperative approach
        List<Person> females = new ArrayList<>();

        for (Person person : people) {
            if (person.gender.equals(Gender.FEMALE)) {
                females.add(person);
            }
        }

        for (Person female : females) {
            System.out.println(female);
        }

        // Declarative approach
        people.stream()
                .filter(person -> person.gender.equals(Gender.FEMALE))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        females.forEach(System.out::println);
    }

    static class Person {

        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }

    }

    enum Gender {
        MALE,
        FEMALE
    }

}
