package JavaOftenUseClassPark.RegexClass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//将数字全部替换为”_“
public class PatternMatcher_2 {
    public static void main(String[] args) {

        String str="A1B22C333D4444E55555F";
        String pat="\\d+";

        Pattern p=Pattern.compile(pat);
        Matcher m=p.matcher(str);
        String newString=m.replaceAll("_");
        System.out.println(newString);

    }
}
