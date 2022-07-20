package JavaOftenUseClassPark.RegexClass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//检查字符串是否为合法的日期格式
public class PatternMatcher_0 {
    public static void main(String[] args) {
        String str="1893-09-12";
        String pat="\\d{4}-\\d{2}-\\d{2}";

        Pattern p=Pattern.compile(pat);
        Matcher m=p.matcher(str);

        if(m.matches()){
            System.out.println("合法！！");
        }else {
            System.out.println("非法！！");
        }
    }
}
