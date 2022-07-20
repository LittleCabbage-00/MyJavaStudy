package JavaOftenUseClassPark.CalendarDateClass;

import java.text.DateFormat;
import java.util.Date;

public class DateFormatClass {
    public static void main(String[] args) {
        DateFormat df1=DateFormat.getDateInstance();
        DateFormat df2=DateFormat.getDateTimeInstance();
        System.out.println(df1.format(new Date()));
        System.out.println(df2.format(new Date()));
    }
}
