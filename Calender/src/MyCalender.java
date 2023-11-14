import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;

public class MyCalender {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println("Calender Type: "+c.getCalendarType());
        c.set(2017,8-1,14);
        System.out.println(c.get(Calendar.DAY_OF_WEEK)-1);
        String us= NumberFormat.getCurrencyInstance(new Locale("EN","IN")).format(25000);
        System.out.println(us);
    }
}
