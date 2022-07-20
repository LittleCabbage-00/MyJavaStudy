package OOP.StringStudy;
//字符串和数组的转换
public class StringToArray {
    public static void main(String[] args){
        String str1="hello";
        char[] c=str1.toCharArray();                            //字符串变数组
        System.out.print("转换后的数组为： ");
        for(int i=0;i<c.length;i++){                            //输出数组
            System.out.print(c[i]+"\t");
        }
        System.out.println("");
        String str2=new String(c);                               //全部字符数组变string
        String str3=new String(c,0,2);              //部分字符变string
        System.out.print("数组变回字符串： "+str2+"\n");
        System.out.print("从str1[0]开始到str[2]变成字符串： "+str3+"\n");
        System.out.print("取出str1[3]位置的字符： "+str1.charAt(3)+"\n");//取出指定位置的字符
        byte[] b=str1.getBytes();                                //将字符串变成byte数组
        System.out.print("byte字符串： "+new String(b)+"\n");      //将全部byte数组变成字符串
        System.out.print("从b[1]开始到b[2]变成字符串： "+new String(b,1,2)+"\n");
        //将部分byte数组变成字符串
        //offset：开始位置    length/count：打印长度
    }
}
