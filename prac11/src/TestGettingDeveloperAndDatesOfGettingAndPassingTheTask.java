import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

class TestGettingDeveloperAndDatesOfGettingAndPassingTheTask {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy',' HH:mm:ss");
        Date date = new Date();
        Date date1 = new Date();
        date1.setTime(1695200000000L);
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 9);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.DAY_OF_MONTH, 2);
        cal.set(Calendar.YEAR, 2023);
        cal.set(Calendar.MONTH, 9);
        System.out.println("Разработал: Редькин Р.В.\n" +
                "Дата получаения задания: " + sdf.format(cal.getTime()) +
                "\nДата сдачи: " + sdf.format(date));
    }
}