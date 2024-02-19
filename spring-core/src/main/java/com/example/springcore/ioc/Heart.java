package com.example.springcore.ioc;

public class Heart {

    private String type;
    private int version;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public void pump() {
        System.out.println("Heart is pumping...");
        System.out.println("Heart type: " + type);
        System.out.println("Heart version: " + version);
    }

}
