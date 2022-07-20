package JavaIOClass.RomInOutStreamClass;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import javax.imageio.IIOException;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

//使用内存操作流完成大写字母变小写字母
public class ChangeCaps_ByStream {
    public static void main(String[] args) throws Exception{
        String str="HELLO WORLD";
        ByteArrayInputStream bis = new ByteArrayInputStream(str.getBytes());
        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        int temp=0;
        while ((temp=bis.read())!=-1){
            char c=(char) temp;
            bos.write(Character.toLowerCase(c));
        }
        String newStr=bos.toString();
        try {
            bis.close();
            bos.close();
        }catch (IIOException e){
            e.printStackTrace();
        }
        System.out.println(newStr);
    }
}
