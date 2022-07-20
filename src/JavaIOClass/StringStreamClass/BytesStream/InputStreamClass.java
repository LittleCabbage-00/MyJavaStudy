package JavaIOClass.StringStreamClass.BytesStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

//从文件中读取数据
public class InputStreamClass {
    public static void main(String[] args) throws Exception{
        //指定文件
        File f = new File("d:" + File.separator + "ComputerProgram" + File.separator + "Desktop" + File.separator + "text_t.txt");

        //实例化
        InputStream input=null;
//        InputStream input = new FileInputStream(f);
        input=new FileInputStream(f);

        //读数据
        byte[] b=new byte[1024];
            //此时数据已经到b里面了，后面只需要调用b就能找到数据
       int len =input.read(b);//将内容读出来

        //close
        input.close();

        //输出到控制台
//        System.out.println(new String(b));
        System.out.println(len);
        //把byte数组变成字符串输出
        System.out.println(new String(b,0,len));
    }
}
