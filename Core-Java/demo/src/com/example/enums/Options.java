package com.example.enums;

public enum Options {

    PENDING ("Pending"),
    PROCESSING ("Processing"),
    COMPLETED ("Completed"),
    BACKLOG ("Backlog");

    private String value;

    Options(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

}
