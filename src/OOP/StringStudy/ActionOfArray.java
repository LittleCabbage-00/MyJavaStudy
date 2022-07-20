package OOP.StringStudy;
//字符串的相关操作
//包括length()方法获取字符串长度，indexOf()方法指定字符查找位置，trim()方法删掉字符两边空格
//substring()方法截取字符串，split()方法指定特殊字符拆分
//toUpperCase()方法转化大写，toLowerCase()方法转化小写
//startsWith()判断字符串开头字符是否是指定字符 endsWith()判断字符串结尾字符是否是指定字符
//equalsIgnoreCase()方法不区分大小写进行字符串比较，而equals()方法要进行大小写比较
//replaceAll()方法替换指定字符串为其他指定字符串
public class ActionOfArray {
    public static void main(String[] args){
        /*length()*/
        String str1="hello" ;
        System.out.print("str1字符串的长度： "+str1.length()+"\n");//使用length()方法取得字符串长度
        /*indexOf()*/
        System.out.println("查找str1里面\"o\"的位置： "+str1.indexOf("o"));
        //指定字符"o"查找位置，从默认的str1[0]开始查
        System.out.println("指定从str1[3]开始查\"l\"的位置： "+str1.indexOf("l",3));
        //指定位置开始查找字符，从str1[3]开始查找
        System.out.println("查找字符\"x\"的位置： "+str1.indexOf("x"));//指定字符查找没查到就返回-1
        /*trim()*/
        String str4="        world          ";
        System.out.print("清除str4两边的空格："+str4.trim()+"\n");     //调用清除空格方法trim()
        /*substring()*/
        String str5="hello cqupt";
        System.out.print("从str5[6]开始截取字符："+str5.substring(6)+"\n");
        //从第7个位置开始截取
        System.out.print("截取str5[0]到str5[5]的字符： "+str5.substring(0,5)+"\n");
        //截取1到6号位置的内容
        /*split()*/
        System.out.println("以空格为分割方式对字符串进行分割：");
        String str6="hello cqupt";
        String[] s=str6.split(" ");                         //按空格进行字符串的拆分
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
        /*toUpperCase()*/
        System.out.println("把hello cqupt变成大写： "+"hello cqupt".toUpperCase());
        //转换成大写
        /*toLowerCase()*/
        System.out.println("把HELLO CQUPT变成小写： "+"HELLO CQUPT".toLowerCase());
        //转换成小写
        /*startsWith() endsWith()*/
        String str7="start123";
        String str8="123start";
        if(str8.startsWith("123"));{
            System.out.println("str8 is startsWith 123");
        }
        if(str7.endsWith("123")){
            System.out.println("str7 is endsWith 123");
        }
        /*equals() equalsIgnoreCase()*/
        String str9="HELLO";
        String str10="hello";
        System.out.println("str9 equals str10 :"+str9.equals(str10));
        System.out.println("str9 equalsIgnoreCase str10 :"+str9.equalsIgnoreCase(str10));
        /*replaceAll()*/
        String str11="heloo";
        String newstr11=str11.replaceAll("o","l");
        System.out.println("str11("+str11+") become to :"+newstr11);
    }
}
