package JavaOftenUseClassPark.CalendarDateClass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTimestampClass {
    public static void main(String[] args) {

        DateTime dateTime = new DateTime();
        System.out.println(dateTime.getDate());
        System.out.println(dateTime.getDateComplete());
        System.out.println(dateTime.getTimeStamp());

    }
}
class DateTime{
    private SimpleDateFormat sdf=null;

    public String getDate(){
    this.sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
    return this.sdf.format(new Date());
    }

    public String getDateComplete(){
        this.sdf=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒SSS毫秒");
        return this.sdf.format(new Date());
    }

    public String getTimeStamp(){
        this.sdf=new SimpleDateFormat("yyyyMMddHHmmssSSS");
        return this.sdf.format(new Date());
    }
}