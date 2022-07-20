package JavaIOClass.StringStreamClass.StringStream;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

//字符输入流reader
public class InputStream_Reader {
    public static void main(String[] args) throws Exception{
        //先找文件
        File f = new File("d:" + File.separator + "ComputerProgram" + File.separator + "Desktop" + File.separator + "text_t.txt");

        //实例化
        Reader reader = new FileReader(f);

        //读操作
        char[] c=new char[1024];
        int len=reader.read();

        reader.close();
        System.out.println(new String(c,0,len));
    }
}
