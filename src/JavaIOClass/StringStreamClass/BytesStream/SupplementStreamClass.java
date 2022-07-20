package JavaIOClass.StringStreamClass.BytesStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

//在字符之后追加字符
public class SupplementStreamClass {
    public static void main(String[] args) throws Exception{
        //指定文件
        File f = new File("d:" + File.separator + "ComputerProgram" + File.separator + "Desktop" + File.separator + "text_t.txt");

        //实例化，转型
        OutputStream out = new FileOutputStream(f, true);

        //写，用字符串，数组输入进去
        String str="hello world";
        String str1="\r\nhello world";

        //加入str
        byte[] b=str.getBytes();
        for (int i = 0; i < b.length; i++) {
            out.write(b[i]);
        }

        //加入str1
        byte[] b1=str1.getBytes();
        for (int i = 0; i < b1.length; i++) {
            out.write(b1[i]);
        }

        //close
        out.close();
    }
}
