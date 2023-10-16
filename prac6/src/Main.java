import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("So.. here i test Nameable, Priceable, Printabel and implement class Book");
        // tasks number 3, 4, 6 and 7 :)
        System.out.println("Enter the original price of Pirates of the Cat sea");
        Book PiratesOfTheCatSea = new Book("Pirates of the Cat sea", scanner.nextInt());
        System.out.println("Enter the original price of Harry Potter");
        Book HarryPotter = new Book("Harry Potter", scanner.nextInt());
        PiratesOfTheCatSea.print();
        HarryPotter.print();
        PiratesOfTheCatSea.getName();
        HarryPotter.getName();
        PiratesOfTheCatSea.getPrice();
        PiratesOfTheCatSea.setPrice(700);
        PiratesOfTheCatSea.getPrice();
        HarryPotter.getPrice();
        HarryPotter.setPrice(2500);
        HarryPotter.getPrice();
    }
}