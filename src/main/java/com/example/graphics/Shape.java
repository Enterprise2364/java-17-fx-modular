package com.example.graphics;

public abstract class Shape {
    private double x,y;

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public abstract double computeArea();

    public abstract double computeCirumference();

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String toString() {
        return "Shape{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
