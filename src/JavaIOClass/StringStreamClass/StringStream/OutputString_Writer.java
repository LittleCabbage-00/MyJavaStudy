package JavaIOClass.StringStreamClass.StringStream;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

//字符输出流
public class OutputString_Writer {
    public static void main(String[] args) throws Exception{
        //先找文件
        File f = new File("d:" + File.separator + "ComputerProgram" + File.separator + "Desktop" + File.separator + "text_t.txt");

        //实例化
        Writer out = new FileWriter(f);

        //写入
        String str="my world";
        out.write(str);

        //close
        out.close();
    }
}
