package com.example.enums;

public enum Operation {

    PLUS("+") {
        public double apply(double x, double y) { return x + y; }
    },
    MINUS("-") {
        public double apply(double x, double y) { return x - y; }
    },
    TIMES("*") {
        public double apply(double x, double y) { return x * y; }
    },
    DIVIDE("/") {
        public double apply(double x, double y) { return x / y; }
    };

    private final String operation;

    Operation(String operation) {
        this.operation = operation;
    }

    @Override public String toString() { return operation; }

    public abstract double apply(double x, double y);

}
