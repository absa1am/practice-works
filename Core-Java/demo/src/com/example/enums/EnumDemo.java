package com.example.enums;

public class EnumDemo {

    public static void main(String[] args) {
        double x = 5;
        double y = 7;

        for (Operation operation : Operation.values())
            System.out.println(x + " " + operation + " " + y + " = " + operation.apply(x, y));
    }

}
