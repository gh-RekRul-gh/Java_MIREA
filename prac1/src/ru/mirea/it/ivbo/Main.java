package ru.mirea.it.ivbo;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static int min(int[] array) {
        if (array.length == 0)
            return -1;
        int ans = array[0];
        for (int i = 1; i < array.length; ++i) {
            ans = Math.min(ans, array[i]);
        }
        return ans;
    }

    private static int max(int[] array) {
        if (array.length == 0)
            return -1;
        int answer = array[0];
        for (int i = 1; i < array.length; ++i) {
            answer = Math.max(answer, array[i]);
        }
        return answer;
    }

    public static int sum(int[] array) {
        int answer = 0;
        for (int i : array) {
            answer += i;
        }
        return answer;
    }

    public static long factorial(int n) {
        long answer = 1;
        for (int i = 2; i <= n; ++i) {
            answer *= i;
        }
        return answer;
    }

    public static void main(String[] args) {
        // начало пункта 3
        System.out.println("Here 3rd item starts");
        int[] array = {3, 7, 4, 8, 121, 14, -5};
        int su = sum(array);
        System.out.println("Average is " + (double) su / array.length);
        // конец пункта 3

        // начало пункта 4
        System.out.println("Here 4th item starts");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = scanner.nextInt();
        int[] array1 = new int[size];
        int index = 0;
        while (index < size) {
            array1[index] = scanner.nextInt();
            index++;
        }
        System.out.println("Sum of array is " + sum(array1));
        System.out.println("Max number in the array is " + max(array1));
        System.out.println("Min number in the array is " + min(array1));
        // конец пункта 4

        // начало пункта 5
        System.out.println("Here 5th item starts");
        for (String s : args) {
            System.out.println(s);
        }
        // конец пункта 5

        // начало пункта 6
        System.out.println("Here 6th item starts");
        for (int i = 1; i <= 10; ++i) {
            System.out.print("Harmonic number with number " + i + " is ");
            System.out.printf("%.5f%n", (double) 1 / i);
        }
        // конец пункта 6

        // начало пункта 7
        System.out.println("Here 7th item starts");
        System.out.println("Enter the factorial number you want to get");
        int n = scanner.nextInt();
        System.out.println(factorial(n));
        // конец пункта 7
    }

}