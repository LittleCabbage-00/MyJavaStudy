package JavaIOClass.StringStreamClass.BytesStream;

import java.io.File;
import java.io.OutputStream;
import java.nio.file.Files;

//用字节流写入字符
public class WriteInClass {
    public static void main(String[] args) throws Exception{
        //先找文件
        File f = new File("d:" + File.separator + "ComputerProgram" + File.separator + "Desktop" + File.separator + "text_t.txt");

        //实例化对象
        OutputStream out = Files.newOutputStream(f.toPath());

        //写入
        String str="my java study";
        byte[] b=str.getBytes();
        out.write(b);

        //close
        out.close();
    }
}