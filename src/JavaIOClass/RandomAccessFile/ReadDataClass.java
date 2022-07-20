package JavaIOClass.RandomAccessFile;

import java.io.File;
import java.io.RandomAccessFile;

//读取数据
public class ReadDataClass {
    public static void main(String[] args) throws Exception{
        //指定文件
        File f = new File("d:" + File.separator + "ComputerProgram" + File.separator + "Desktop" + File.separator + "text_t.txt");

        RandomAccessFile rdf = null ;
        rdf = new RandomAccessFile(f,"r") ;
        String name = null ;
        int age = 0 ;
        byte b[] = new byte[8] ;

        rdf.skipBytes(12) ;
        for(int i=0;i<b.length;i++){
            b[i] = rdf.readByte() ;
        }
        name = new String(b) ;
        age = rdf.readInt() ;
        System.out.println("第二个人的信息 --> 姓名：" + name + "；年龄：" + age) ;

        rdf.seek(0) ;
        for(int i=0;i<b.length;i++){
            b[i] = rdf.readByte() ;
        }
        name = new String(b) ;
        age = rdf.readInt() ;
        System.out.println("第一个人的信息 --> 姓名：" + name + "；年龄：" + age) ;
        rdf.skipBytes(12) ;
        for(int i=0;i<b.length;i++){
            b[i] = rdf.readByte() ;
        }
        name = new String(b) ;
        age = rdf.readInt() ;
        System.out.println("第三个人的信息 --> 姓名：" + name + "；年龄：" + age) ;
        rdf.close() ;
    }
}
