package com.example.streams;

import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

public class PersonDemo {

    public static void main(String... args) {
        List<Person> rosters = Person.createRoster();

        for (Person p : rosters) {
            System.out.println(p.getName());
        }

        System.out.println("------------------------------");

        Predicate<Person> predicate = new Predicate<Person>() {
            @Override
            public boolean test(Person person) {
                return person.getGender() == Person.Sex.MALE;
            }
        };

        ToIntFunction<Person> function1 = new ToIntFunction<Person>() {
            @Override
            public int applyAsInt(Person value) {
                return value.getAge();
            }
        };

        int sum1 = rosters.stream()
                .filter(predicate)
                .mapToInt(function1)
                .sum();

        System.out.println(sum1);

        Function<Person, Integer> function2 = new Function<Person, Integer>() {
            @Override
            public Integer apply(Person person) {
                return person.getAge();
            }
        };

        BinaryOperator<Integer> binaryOperator = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        };

        int sum2 = rosters.stream().filter(predicate).map(function2).reduce(0, binaryOperator);

        System.out.println(sum2);

        System.out.println(sum(rosters));

        /* Creating Optional */
        Optional<String> nonNullOptional = Optional.of("");

        String nullableValue = null;
        Optional<String> nullableOptional = Optional.ofNullable(nullableValue);

        /* Using Optional */
        System.out.println(nonNullOptional.orElseGet(() -> "Java"));
        System.out.println();
    }

    private static <T> Integer sum(List<Person> persons) {
        int sum = 0;

        BinaryOperator<Integer> binaryOperator = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        };

        for (Person person : persons) {
            binaryOperator.apply(sum, person.getAge());
        }

        return sum;
    }

}
