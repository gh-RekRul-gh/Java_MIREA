import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Enter the number of what you want to check
                1 - Time of getting and passing this task
                2 - Compare current date with the one you will enter
                3 - Student's date of birth
                4 - Get date from what you enter
                5 - Compare time of code compilation""");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> TestGettingDeveloperAndDatesOfGettingAndPassingTheTask.main(args);
            case 2 -> TestDatesComparing.main(args);
            case 3 -> TestStudentDateWork.main(args);
            case 4 -> TestEnteringDate.main(args);
            case 5 -> TestStructuresWorkTime.main(args);
            default -> System.out.println("Wrong input");
        }
    }
}