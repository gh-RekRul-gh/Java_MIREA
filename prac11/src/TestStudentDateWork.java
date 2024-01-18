import java.text.ParseException;
import java.util.Scanner;

public class TestStudentDateWork {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of the student");
        String name = scanner.next();
        Student student = new Student(name);
        System.out.println(student.getDateOfBirth());
    }
}
