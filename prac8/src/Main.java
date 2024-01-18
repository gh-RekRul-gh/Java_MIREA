import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Enter your choice
                1 - if you want TriangleSequence
                2 - if From1ToN
                3 - if SumOfDigits
                4 - if WithoutTwoZeroes""");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> TriangleSequence.main(args);
            case 2 -> From1ToN.main(args);
            case 3 -> SumOfDigits.main(args);
            case 4 -> WithoutTwoZeros.main(args);
            default -> System.out.println("Wrong input, try again");
        }
    }
}