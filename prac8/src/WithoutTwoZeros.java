import java.util.Scanner;

public class WithoutTwoZeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers A and B");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Number of sequences with " + a + " zeros and " + b + "ones is " +
                countSequences(a, b, true));
    }

    private static int countSequences(int a, int b, boolean canPutZero) {
        if (a == 0 && b == 0)
            return 1;
        int ans = 0;
        if (canPutZero && a != 0)
            ans += countSequences(a - 1, b, false);
        if (b != 0)
            ans += countSequences(a, b - 1, true);
        return ans;
    }
}
