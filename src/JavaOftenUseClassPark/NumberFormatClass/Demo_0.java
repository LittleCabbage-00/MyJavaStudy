package JavaOftenUseClassPark.NumberFormatClass;

import java.text.NumberFormat;

//数字格式化
public class Demo_0 {
    public static void main(String[] args) {
        NumberFormat nf=NumberFormat.getInstance();
        System.out.println(nf.format(10000000));
        System.out.println(nf.format(10000.345));
    }
}
