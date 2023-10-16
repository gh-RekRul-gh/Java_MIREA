import java.util.Scanner;

public class From1ToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number n");
        int n = scanner.nextInt();
        printNumbers(n, 1);
    }

    private static void printNumbers(int n, int current) {
        if (current > n)
            return;
        System.out.println(current);
        printNumbers(n, current + 1);
    }
}
