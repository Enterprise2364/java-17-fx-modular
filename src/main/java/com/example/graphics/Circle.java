package com.example.graphics;

public class Circle extends Shape{
    private double radius;
    double pi = Math.PI;

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }
    @Override
    public double computeArea() {
        return radius*radius*pi;
    }
    @Override
    public double computeCirumference() {
        return 2*radius*pi;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
