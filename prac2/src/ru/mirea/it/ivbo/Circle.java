package ru.mirea.it.ivbo;

public class Circle {
    private double radius = 0;

    public int compareToAnother(Circle another) {
        if (this.getRadius() < another.getRadius())
            return 1;
        else if (this.getRadius() > another.getRadius())
            return 2;
        return 3;
    }
    public Circle() {
    }

    public Circle(double val) {
        radius = val;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }
}
