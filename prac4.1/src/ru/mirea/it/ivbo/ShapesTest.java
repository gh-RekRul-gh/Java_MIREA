package ru.mirea.it.ivbo;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(1.5, 3.5);
        Circle circle = new Circle(5.34);
        Square square = new Square(3.356);
        rectangle.setFirstSide(0.55);
        rectangle.setSecondSide(1.33);
        System.out.println("Rectangle's first side is " + rectangle.getFirstSide() +
                " and its second side is " + rectangle.getSecondSide());
        circle.setRadius(3.33);
        System.out.println("Circle's radius is " + circle.getRadius());
        square.setSide(1.789);
        System.out.println("Square's side is " +  square.getSide() + "\n");

        System.out.println("What about forms?");
        System.out.println("Circle " + circle.getType());
        System.out.println("Rectangle " + rectangle.getType());
        System.out.println("Square " + square.getType() + "\n");

        System.out.println("What about areas?");
        System.out.format("Circle area is %.2f%n", circle.getArea());
        System.out.format("Rectangle area is %.2f%n", rectangle.getArea());
        System.out.format("Square area is %.2f%n%n", square.getArea());

        System.out.println("What about perimeters?");
        System.out.format("Circle perimeter is %.2f%n", circle.getPerimeter());
        System.out.format("Rectangle perimeter is %.2f%n", rectangle.getPerimeter());
        System.out.format("Square perimeter is %.2f%n%n", square.getPerimeter());

        System.out.println("What we know about circle?\n" + circle);
        System.out.println("What we know about rectangle?\n" + rectangle);
        System.out.println("What we know about square?\n" + square);
    }
}
