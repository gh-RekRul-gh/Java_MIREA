import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Enter 1 - if you want to guess a number
                And 2 - if you want to edit a text area""");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> NumberGuessGame.test();
            case 2 -> {
                TextAreaEditor textAreaEditor = new TextAreaEditor();
            }
            default -> System.out.println("Wrong input");
        }
    }
}