package ru.mirea.it.ivbo;

import java.util.Random;

import java.util.Scanner;

import java.util.Arrays;

public class RandomArray {
    public static void main(String[] args) {
        Random random = new Random();
        int randomSize = random.nextInt(7) + 3;
        float[] array = new float[randomSize];
        System.out.println("Randomized size of the array is " + randomSize);
        for (int i = 0; i < randomSize; ++i) {
            array[i] = (float) (Math.random() * 20 - 10);
        }
        System.out.println("The array is");
        for (int i = 0; i < randomSize; ++i) {
            String delimeter = (i != randomSize - 1)? " " : " \n";
            System.out.print(array[i] + delimeter);
        }
        Arrays.sort(array);
        System.out.println("The sorted array is");
        for (int i = 0; i < randomSize; ++i) {
            System.out.print(array[i] + " ");
        }
    }
}
