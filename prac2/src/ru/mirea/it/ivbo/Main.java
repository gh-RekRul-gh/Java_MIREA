package ru.mirea.it.ivbo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num_of_task;
        System.out.println("Enter 1 if you want the task of reversing an array, or enter 2 if you want to work with circles");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> ReverseArray.main(args);
            case 2 -> CircleTest.main(args);
            default -> System.out.println("Wrong choice man");
        }
    }
}