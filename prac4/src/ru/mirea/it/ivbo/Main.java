package ru.mirea.it.ivbo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите 1, если хотите узнать про сезоны года, или 2, если хотите узнать про компьютер");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> SeasonCompiler.main(args);
            case 2 -> ComputerCompiler.main(args);
            default -> System.out.println("Wrong input");
        }
    }
}