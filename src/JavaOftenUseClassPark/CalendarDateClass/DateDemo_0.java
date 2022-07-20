package JavaOftenUseClassPark.CalendarDateClass;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateDemo_0 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        //显示细化时间
        Calendar calendar=null;
        calendar = new GregorianCalendar();
        System.out.println(calendar.get(Calendar.YEAR)+"年");
        System.out.println(calendar.get(Calendar.MONTH)+"月");
        System.out.println(calendar.get(Calendar.DATE)+"日");
        System.out.println(calendar.get(Calendar.HOUR)+"时");
        System.out.println(calendar.get(Calendar.MINUTE)+"分");
        System.out.println(calendar.get(Calendar.SECOND)+"秒");
        System.out.println(calendar.get(Calendar.MILLISECOND)+"毫秒");
    }
}
