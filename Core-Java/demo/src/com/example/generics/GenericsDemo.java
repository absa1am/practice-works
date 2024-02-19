package com.example.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {

    public static void main(String... args) {
        List os = new ArrayList();

        os.add("Windows");
        os.add("Linux");
        os.add("Mac");
        os.add(5);

        String win = (String) os.get(0);

        os.forEach(System.out::println);
    }

}
