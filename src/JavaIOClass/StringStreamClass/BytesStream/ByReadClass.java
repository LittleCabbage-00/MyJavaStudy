package JavaIOClass.StringStreamClass.BytesStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

//通过read方法读取文件内容
public class ByReadClass {
    public static void main(String[] args) throws Exception{
        //先找文件
        File f = new File("d:" + File.separator + "ComputerProgram" + File.separator + "Desktop" + File.separator + "text_t.txt");

        //实例化
        InputStream input = new FileInputStream(f);

        //读取
        byte[] b = new byte[(int) f.length()];
        for (int i = 0; i < b.length; i++) {
            b[i]=(byte) input.read();
        }

        //close&&sout
        input.close();
        System.out.println(new String(b));
    }
}
