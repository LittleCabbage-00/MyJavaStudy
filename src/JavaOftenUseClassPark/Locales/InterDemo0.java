package JavaOftenUseClassPark.Locales;

import java.util.Locale;
import java.util.ResourceBundle;

public class InterDemo0 {
    public static void main(String[] args) {
        System.out.println("普通资源包：");
        ResourceBundle rb=ResourceBundle.getBundle("Message");
        System.out.println(rb.getString("info"));

        for (int i = 0; i < 20; i++) {
            System.out.print("-");
        }
        System.out.println("");
        System.out.println("其他语言：");
        Locale zhLoc = new Locale("zh", "CN");
        Locale enLoc = new Locale("en", "US");
        Locale frLoc = new Locale("fr", "FR");
        //获取资源包信息
        ResourceBundle zhrb=ResourceBundle.getBundle("Message",zhLoc);
        ResourceBundle enrb=ResourceBundle.getBundle("Message",enLoc);
        ResourceBundle frrb=ResourceBundle.getBundle("Message",frLoc);
        System.out.println(zhrb.getString("info"));
        System.out.println(enrb.getString("info"));
        System.out.println(frrb.getString("info"));
    }
}
