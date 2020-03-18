import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

public class TimestampToDate {
    public static void main(String[] args) {

        // Using date constructor
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        Date date = new Date(timestamp.getTime());
        System.out.println(date);

        // Assigning to Date reference variable

        Date date2 = timestamp;
        System.out.println(date2);

        // Using Calendar
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis( timestamp.getTime() );
        System.out.println(calendar.getTime());
    }
}
