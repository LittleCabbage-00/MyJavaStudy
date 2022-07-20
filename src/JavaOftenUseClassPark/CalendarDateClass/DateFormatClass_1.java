package JavaOftenUseClassPark.CalendarDateClass;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatClass_1 {
    public static void main(String[] args) {
        DateFormat df1=null;
        DateFormat df2=null;

        df1=DateFormat.getDateInstance(DateFormat.YEAR_FIELD,new Locale("zh","CN"));
        df2=DateFormat.getDateTimeInstance(DateFormat.YEAR_FIELD,DateFormat.ERA_FIELD,new Locale("zh","CN"));
        System.out.println(df1.format(new Date()));
        System.out.println(df2.format(new Date()));
    }
}
