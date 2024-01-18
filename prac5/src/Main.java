import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Enter the number of what you want to check
                1 - Football match UI
                2 - Image of a really DANGEROUS animal!!!""");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> Football.main(args);
            case 2 -> Image.main(args);
            default -> System.out.println("Wrong input");
        }
    }
}