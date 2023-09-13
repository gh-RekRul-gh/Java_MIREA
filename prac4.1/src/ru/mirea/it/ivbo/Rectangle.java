package ru.mirea.it.ivbo;

public class Rectangle extends Shape {
    private double firstSide;
    private double secondSide;

    public Rectangle(double firstSide, double secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    String getType() {
        return "Shape type is rectangle";
    }

    double getArea() {
        return firstSide * secondSide;
    }

    double getPerimeter() {
        return (firstSide + secondSide) * 2;
    }

    @Override
    public String toString() {
        return "This is just a rectangle";
    }

    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }
}
