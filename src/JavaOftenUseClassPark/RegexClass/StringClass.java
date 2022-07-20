package JavaOftenUseClassPark.RegexClass;
//正则表达式检查是否全为数字
import java.util.regex.Pattern;

public class StringClass {
    public static void main(String[] args) {
        String str="123654789";

        if((Pattern.compile("[0-9]+")).matcher(str).matches()){
            System.out.println("number!!");
        }else{
            System.out.println("not a number!!");
        }
    }
}
