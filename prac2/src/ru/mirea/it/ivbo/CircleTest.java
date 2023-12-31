package ru.mirea.it.ivbo;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        System.out.println("Enter the radius of the first circle");
        Scanner scanner = new Scanner(System.in);
        double radius1 = scanner.nextDouble();
        Circle circle1 = new Circle(radius1);
        System.out.println("Radius of the circle1 is " + circle1.getRadius());
        Circle circle2 = new Circle();
        System.out.println("Enter the radius of the second circle");
        double radius2 = scanner.nextDouble();
        circle2.setRadius(radius2);
        System.out.println("Area of the circle2 is " + circle2.area());
        System.out.println("Circumference of the circle2 is " + circle2.circumference());
        int resultOfComparing = circle1.compareToAnother(circle2);
        switch (resultOfComparing) {
            case 1 -> System.out.println("Circle1 is smaller than circle2");
            case 2 -> System.out.println("Circle1 is bigger than circle2");
            case 3 -> System.out.println("Circle1 is equal to circle2");
        }
    }
}
