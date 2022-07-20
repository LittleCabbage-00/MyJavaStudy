package JavaIOClass.SystemClass;

import java.io.InputStream;

//利用System.in从键盘读取数据
public class InStringDemo_0 {
    public static void main(String[] args) throws Exception{
        InputStream input= System.in;

        byte[] b = new byte[1024];
        System.out.println("请输入内容：");
        int len=input.read(b);
        System.out.println("你输入的是："+new String(b,0,len));
        input.close();
    }
}
