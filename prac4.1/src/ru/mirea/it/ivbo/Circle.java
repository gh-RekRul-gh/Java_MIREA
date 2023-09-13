package ru.mirea.it.ivbo;

public class Circle extends Shape {
    private double radius;
    private final double pi = 3.1415926535;

    public Circle(double radius) {
        this.radius = radius;
    }

    public String getType() {
        return "Shape type is circle";
    }

    public double getArea() {
        return pi * radius * radius;
    }

    public double getPerimeter() {
        return 2 * pi * radius;
    }

    @Override
    public String toString() {
        return "This is just a circle";
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
