import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Enter the number of what you want to check
                1 - Animation of running man
                2 - Random shapes""");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> Animation.main(args);
            case 2 -> RandomShapes.main(args);
            default -> System.out.println("Wrong input");
        }
    }
}