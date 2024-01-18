import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Student {
    private final String name;
    private final Date dateOfBirth;

    public Student(String name) {
        this.name = name;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("""
                Enter %s's date of birth
                At first enter the day (dd), then month (mm), then year (yyyy)%n""", name);
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.YEAR, year);
        this.dateOfBirth = calendar.getTime();
    }

    public String getDateOfBirth() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return name + "'s birthday is " + sdf.format(dateOfBirth);
    }
}

