package com.example.springcore.annotations;

public class Student {

    private String name;
    private String interestedCourse;
    private String hobby;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInterestedCourse() {
        return interestedCourse;
    }

    public void setInterestedCourse(String interestedCourse) {
        this.interestedCourse = interestedCourse;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", interestedCourse='" + interestedCourse + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }

}
