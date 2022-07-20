package JavaOftenUseClassPark.NumberFormatClass;

import java.text.DecimalFormat;

//数字格式化模板
public class Demo_1 {
    public static void main(String[] args) {
        FormatDemo fd = new FormatDemo();

        fd.format1("###,###.###",123456.789);
        fd.format1("000,000.000",123456.789);
        fd.format1("00.###$",0.34567);
    }
}
class FormatDemo{
    public void format1(String pattern,double value){
        DecimalFormat df = new DecimalFormat(pattern);
        String str=df.format(value);
        System.out.println("使用了"+pattern+"格式化数字"+value+": "+str);
    }
}
