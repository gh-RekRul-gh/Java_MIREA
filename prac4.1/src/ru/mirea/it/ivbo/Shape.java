package ru.mirea.it.ivbo;

public abstract class Shape {
    abstract String getType();
    abstract double getArea();
    abstract double getPerimeter();
    public String toString() {
        return "This is just a shape";
    }

}
