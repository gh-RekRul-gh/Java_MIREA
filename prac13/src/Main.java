import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Enter your choice
                1 - Work with string
                2 - Number reformatting""");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> StringReformatting.main(args); // task number 1
            case 2 -> Number.main(args); // task number 5
            default -> System.out.println("Wrong input");
        }
    }
}