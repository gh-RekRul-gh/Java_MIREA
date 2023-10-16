import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number n");
        int n = scanner.nextInt();
        System.out.println("Sum of digits of number " + n + " is " + countSum(n));
    }

    private static int countSum(int n) {
        if (n == 0)
            return 0;
        return n % 10 + countSum(n / 10);
    }

}
