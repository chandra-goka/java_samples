import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.TimeZone;

public class CurrentUTCTime {
    public static void main(String[] args) throws ParseException {
        System.out.println(getCurrentUtcTime());
        getCurrentUtcTimeJava8();
        getCurrentUtcTimeJoda();
    }

    private static Date getCurrentUtcTime() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MMM-dd HH:mm:ss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat localDateFormat = new SimpleDateFormat("yyyy-MMM-dd HH:mm:ss");
        return localDateFormat.parse( simpleDateFormat.format(new Date()) );
    }
    private static void getCurrentUtcTimeJava8() throws ParseException {
        Instant instant = Instant.now();
        System.out.println(instant.toString());

        OffsetDateTime now = OffsetDateTime.now( ZoneOffset.UTC );
        System.out.println(now);
    }
    private static void getCurrentUtcTimeJoda() throws ParseException {
        DateTime now = new DateTime(); // Default time zone.
        DateTime zulu = now.toDateTime(DateTimeZone.UTC );
        System.out.println(zulu);
    }
}
