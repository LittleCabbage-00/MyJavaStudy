package JavaIOClass.StringStreamClass.BytesStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

//不知道文件大小，读取文件
public class NoSizeOfFileClass {
    public static void main(String[] args) throws Exception{
        //先找文件
        File f = new File("d:" + File.separator + "ComputerProgram" + File.separator + "Desktop" + File.separator + "text_t.txt");

        //实例化
        InputStream input = new FileInputStream(f);

        //开始读
        int len=0;
        byte[] b=new byte[1024];
        int temp=0;
        while ((temp=input.read()) != -1){
            //检查能否访问到文件末尾，如果temp的值非-1，则文件未读完
            b[len]=(byte) temp;
            len++;
        }

        //close
        input.close();
        System.out.println(new String(b,0,len));
    }
}
