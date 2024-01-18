import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Enter 1 - if you want exception1 (division by 0)
                Enter 2 - if you want exception2 (Exceptions for parseInt())
                Enter 3 - if you want to test my ThrowDemo
                Enter 4 - if you want to test my ThrowDemo2""");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> {
                Exception1 exception1 = new Exception1();
                exception1.exceptionDemo();
            }
            case 2 -> {
                Exception2 exception2 = new Exception2();
                exception2.exceptionDemo();
            }
            case 3 -> {
                ThrowsDemo throwsDemo = new ThrowsDemo();
                System.out.println("For null:");
                throwsDemo.printMessage(null);
                System.out.println("For empty:");
                throwsDemo.printMessage("");
                System.out.println("For normal:");
                throwsDemo.printMessage("normal");
            }
            case 4 -> {
                ThrowsDemo2 throwsDemo2 = new ThrowsDemo2();
                throwsDemo2.getKey();
            }
            default -> System.out.println("Wrong input");
        }

    }
}