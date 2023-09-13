package ru.mirea.it.ivbo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 if you want shapes, or 2 if you want person");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> ShapesTest.main(args);
            case 2 -> PersonTest.main(args);
            default -> System.out.println("Wrong input");
        }
    }
}