package com.example.enums;

public enum Planet {

    MERCURY (3.302, 2.439),
    VENUS (4.869, 6.052),
    EARTH (5.975, 6.378),
    MARS (6.419, 3.393),
    JUPITER (1.899, 7.149),
    SATURN (5.685, 6.027),
    URANUS (8.683, 2.556),
    NEPTUNE (1.024, 2.477);

    private final double mass;
    private final double radius;
    private final double surfaceGravity;
    private static final double G = 6.67300;

    Planet (double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
        surfaceGravity = G * mass;
    }

    public double mass() { return mass; }
    public double radius() { return radius; }
    public double surfaceGravity() { return surfaceGravity; }

    public double surfaceWeight(double mass) {
        return mass * surfaceGravity;
    }

}
