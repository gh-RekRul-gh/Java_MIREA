import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class TestEnteringDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year (yyyy), month (MM), day (dd), hour (hh), minutes (mm)");
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();
        int hour = sc.nextInt();
        int minutes = sc.nextInt();
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.HOUR_OF_DAY, hour);
        calendar.set(Calendar.MINUTE, minutes);

        Date date = calendar.getTime();

        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm 'on' dd/MM/yyyy");
        System.out.println("For Date: " + sdf.format(date));
        System.out.println("For Calendar: " + sdf.format(calendar.getTime()));
    }
}
