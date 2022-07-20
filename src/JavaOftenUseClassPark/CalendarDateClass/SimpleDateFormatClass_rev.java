package JavaOftenUseClassPark.CalendarDateClass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatClass_rev {
    public static void main(String[] args) throws Exception{

        String str="2022-07-14 17:06:14.114";
        String dat="yyyy-MM-dd HH:mm:ss.SSS";

        SimpleDateFormat sdf = new SimpleDateFormat(dat);
        Date d=sdf.parse(str);

        System.out.println(d);
    }
}
