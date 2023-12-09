import java.util.Calendar;

public class MyCalendar {
    static int year;
    static int month;
    static int day;
    static int daysSinceBeginning;
    private static Calendar calendar;

    public MyCalendar() {
        this.calendar = Calendar.getInstance();
    }

    static String myDate() {
        return "Date: " + year + "-" + month + "-" + day;
    }

    static int days() {
        int currentDay = calendar.get(Calendar.DAY_OF_YEAR);
        int daysPassed = currentDay - 1;
        return daysPassed;
    }
}
