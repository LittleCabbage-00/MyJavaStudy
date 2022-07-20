package JavaOftenUseClassPark.RegexClass;
//转义中面对符号的歧义问题
public class PatternMatcher_4 {
    public static void main(String[] args) {
        String info="JFY:2020|CQUPT:2024|DNS:2026";
        //String[] s=info.split("|");
        //这种写法分不出来，需要转义才可以
        String[] s=info.split("\\|");

        System.out.println("字符串的拆分：");
        for (int x = 0; x < s.length; x++) {
            String[] s2=s[x].split(":");
            System.out.println("\t|-"+s2[0]+"\t"+s2[1]);
        }
    }
}
