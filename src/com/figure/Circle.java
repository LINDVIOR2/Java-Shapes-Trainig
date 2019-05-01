package com.figure;
import java.lang.Math;

public class Circle implements Shape {
    private final double pi = Math.PI;

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return pi * Math.pow(radius, 2);
    }

    @Override
    public double perimeter() {
        return 2 * pi * radius;
    }

    @Override
    public String toString() {
        return "Circle(" +
                "radius = " + radius +
                ')';
    }
}
