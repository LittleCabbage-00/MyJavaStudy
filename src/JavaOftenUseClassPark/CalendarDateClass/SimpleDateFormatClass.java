package JavaOftenUseClassPark.CalendarDateClass;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatClass {
    public static void main(String[] args) {
        DateFormat df2= DateFormat.getDateTimeInstance();
        String str=df2.format(new Date());
        System.out.println(str);

        String pt1="yyyy-MM-dd HH:mm:ss";
        String pt2="yyyy年MM月dd日 HH时mm分ss秒";
        SimpleDateFormat sdf1=new SimpleDateFormat(pt1);
        SimpleDateFormat sdf2=new SimpleDateFormat(pt2);
        Date d=null;
        try {
            d=sdf1.parse(str);
        }catch (ParseException e){
            e.printStackTrace();
        }
        System.out.println(sdf2.format(d));
    }
}
