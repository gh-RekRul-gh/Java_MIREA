package ru.mirea.it.ivbo;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        System.out.println("Enter any string you want and end your array entering the word \"exit\"");
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[1000];
        String nextString;
        int elem_number = 0;
        while (!(nextString = scanner.next()).equals("exit")) {
            array[elem_number] = nextString;
            elem_number++;
        }


        for (int i = 0; i < elem_number / 2; ++i) {
            String temp = array[i];
            array[i] = array[elem_number - i - 1];
            array[elem_number - i - 1] = temp;
        }

        for (int i = 0; i < elem_number; ++i) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\nHere is your reversed array of strings");
    }
}

