package JavaOftenUseClassPark.RegexClass;

import java.util.regex.Pattern;

//字符串
public class PatternMatcher_1 {
    public static void main(String[] args) {
        String str="A1B22C333D4444E55555F";
        String pat="\\d+";

        Pattern p=Pattern.compile(pat);
        String s[] =p.split(str);
        for (int x = 0; x < s.length; x++) {
            System.out.print(s[x]+"\t");
        }
    }
}
