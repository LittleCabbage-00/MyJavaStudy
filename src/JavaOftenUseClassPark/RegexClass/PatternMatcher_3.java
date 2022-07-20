package JavaOftenUseClassPark.RegexClass;
//string对正则表达式的支持
public class PatternMatcher_3 {
    public static void main(String[] args) {
        String str="A1B22C333D4444E55555F".replaceAll("\\d+","_");
        boolean tmp="2022-07-16".matches("\\d{4}-\\d{2}-\\d{2}");
        String[] s="A1B22C333D4444E55555F".split("\\d+");

        System.out.println("字符串替换操作： "+str);
        System.out.println("字符串替换验证： "+tmp);
        System.out.println("字符串拆分： ");
        for (int x = 0; x < s.length; x++) {
            System.out.print(s[x]+"\t");
        }
    }
}
