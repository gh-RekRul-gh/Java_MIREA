import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Enter 1 - if you want a calculator
                And 2 - if you want countries information""");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> new Calculator();
            case 2 -> MyJComboBox.test();
            default -> System.out.println("Wrong input");
        }
    }
}