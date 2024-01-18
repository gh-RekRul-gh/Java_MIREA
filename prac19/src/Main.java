import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Enter 1 - if you want Eshop with TIN
                Enter 2 - if you want to work with students""");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> Eshop.main(args);
            case 2 -> LabClassDriver.main(args);
            default -> System.out.println("Wrong input");
        }
    }
}