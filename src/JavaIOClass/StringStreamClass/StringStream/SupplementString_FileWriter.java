package JavaIOClass.StringStreamClass.StringStream;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

//追加文件内容
public class SupplementString_FileWriter {
    public static void main(String[] args) throws Exception{
        //先找文件
        File f = new File("d:" + File.separator + "ComputerProgram" + File.separator + "Desktop" + File.separator + "text_t.txt");

        //实例化
        Writer out = new FileWriter(f,true);

        //写入
        String str="\r\nsomething wrong";
        out.write(str);

        out.close();
    }
}
