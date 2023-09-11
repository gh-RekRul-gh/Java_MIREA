package ru.mirea.it.ivbo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter 1 if you want to get a randomized array, or 2 if you want formatted string");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> RandomArray.main(args);
            case 2 -> StringFormatting.main(args);
            default -> System.out.println("Wrong input");
        }
    }
}