package JavaIOClass.RandomAccessFile;

import java.io.File;
import java.io.RandomAccessFile;

//写入数据
public class WriteInClass {
    public static void main(String[] args) throws Exception{
        //创建新文件
        File f = new File("d:" + File.separator + "ComputerProgram" + File.separator + "Desktop" + File.separator + "text_t.txt");
        f.createNewFile();

        //写入
        RandomAccessFile rdf = null ;
        rdf = new RandomAccessFile(f,"rw") ;// 读写模式，如果文件不存在，会自动创建
        String name = null ;
        int age = 0 ;
        name = "zhangsan" ;
        age = 30 ;
        rdf.writeBytes(name) ;
        rdf.writeInt(age) ;
        name = "lisi    " ;
        age = 31 ;
        rdf.writeBytes(name) ;
        rdf.writeInt(age) ;
        name = "wangwu  " ;
        age = 32 ;
        rdf.writeBytes(name) ;
        rdf.writeInt(age) ;
        rdf.close() ;
    }
}
