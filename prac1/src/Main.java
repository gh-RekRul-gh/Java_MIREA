package ru.mirea.ivbo.lab1;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static int min(int[] arr) {
        if (arr.length == 0) return -1;
        int ans = arr[0];
        for (int i = 1; i < arr.length; ++i) {
            ans = Math.min(ans, arr[i]);
        }
        return ans;
    }

    private static int max(int[] arr) {
        if (arr.length == 0) return -1;
        int ans = arr[0];
        for (int i = 1; i < arr.length; ++i) {
            ans = Math.max(ans, arr[i]);
        }
        return ans;
    }

    public static int sum(int[] arr) {
        int ans = 0;
        for (int i : arr) { ans += i; }
        return ans;
    }

    public static long factorial(int n) {
        long ans = 1;
        for (int i = 2; i <= n; ++i) {
            ans *= i;
        }
        return ans;
    }

    public static void main(String[] args) {
        // начало пункта 3
        System.out.println("Here 3rd item starts");
        int[] arr = {3, 7, 4, 8, 121, 14, -5};
        int su = sum(arr);
        System.out.println("Average is " + (double) su / arr.length);
        // конец пункта 3

        // начало пункта 4
        System.out.println("Here 4th item starts");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr1 = new int[size];
        int num = 0;
        while (num < size) {
            arr1[num] = sc.nextInt();
            num++;
        }
        System.out.println("Sum of array is " + sum(arr1));
        System.out.println("Max number in the array is " + max(arr1));
        System.out.println("Min number in the array is " + min(arr1));
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
            System.out.println("Harmonic number with number " + i + " is " + (double) 1/i);
        }
        // конец пункта 6

        // начало пункта 7
        System.out.println("Here 7th item starts");
        System.out.println("Enter the factorial number you want to get");
        int n = sc.nextInt();
        System.out.println(factorial(n));
        // конец пункта 7
    }

}