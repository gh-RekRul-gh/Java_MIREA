import java.util.Scanner;

public class TriangleSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number n");
        int n = scanner.nextInt();
        printSequence(n, 1, 0);
    }

    private static void printSequence(int n, int currentNumber, int count) {
        if (n == 0)
            return;
        System.out.println(currentNumber + " ");
        count++;
        if (count == currentNumber) {
            currentNumber++;
            count = 0;
        }
        printSequence(n - 1, currentNumber, count);
    }
}
