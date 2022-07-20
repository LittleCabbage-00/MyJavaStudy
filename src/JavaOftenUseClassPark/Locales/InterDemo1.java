package JavaOftenUseClassPark.Locales;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class InterDemo1 {
    public static void main(String[] args) {

        Locale zhLoc = new Locale("zh", "CN");
        Locale enLoc = new Locale("en", "US");
        Locale frLoc = new Locale("fr", "FR");
        //获取资源包信息
        ResourceBundle zhrb=ResourceBundle.getBundle("Message",zhLoc);
        ResourceBundle enrb=ResourceBundle.getBundle("Message",enLoc);
        ResourceBundle frrb=ResourceBundle.getBundle("Message",frLoc);
        String st_zh=zhrb.getString("info");
        String st_en=enrb.getString("info");
        String st_fr=frrb.getString("info");
        System.out.println(MessageFormat.format(st_zh,"文件"));
        System.out.println(MessageFormat.format(st_en,"file"));
        System.out.println(MessageFormat.format(st_fr,"Documentation"));

    }
}
