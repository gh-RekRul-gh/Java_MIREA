import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Enter your choice:
                1 - if you want to Test Process String
                2 - if you want Test Magazines And Books""");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> TestProcessString.main(args); // tasks 5 and 6
            case 2 -> TestMagazinesAndBooks.main(args); // tasks 7 and 8
            default -> System.out.println("Wrong input, try again");
        }
    }
}