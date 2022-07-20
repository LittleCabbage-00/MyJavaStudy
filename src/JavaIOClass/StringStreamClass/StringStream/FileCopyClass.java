package JavaIOClass.StringStreamClass.StringStream;

import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//字符的复制操作
public class FileCopyClass {
    public static void main(String[] args) throws Exception{
        if(args.length!=2){		// 判断是否是两个参数
            System.out.println("输入的参数不正确。") ;
            System.out.println("例：java Copy 源文件路径 目标文件路径") ;
            System.exit(1) ;	// 系统退出
        }
        File f1 = new File(args[0]) ;	// 源文件的File对象
        File f2 = new File(args[1]) ;	// 目标文件的File对象
        if(!f1.exists()){
            System.out.println("源文件不存在！") ;
            System.exit(1) ;
        }
        InputStream input = null ;		// 准备好输入流对象，读取源文件
        OutputStream out = null ;		// 准备好输出流对象，写入目标文件
        try{
            input = new FileInputStream(f1) ;
        }catch(FileNotFoundException e){
            e.printStackTrace() ;
        }
        try{
            out = new FileOutputStream(f2) ;
        }catch(FileNotFoundException e){
            e.printStackTrace() ;
        }
        if(input!=null && out!=null){	// 判断输入或输出是否准备好
            int temp = 0 ;
            try{
                while((temp=input.read())!=-1){	// 开始拷贝
                    out.write(temp) ;	// 边读边写
                }
                System.out.println("拷贝完成！") ;
            }catch(IOException e){
                e.printStackTrace() ;
                System.out.println("拷贝失败！") ;
            }
            try{
                input.close() ;		// 关闭
                out.close() ;		// 关闭
            }catch(IOException e){
                e.printStackTrace() ;
            }
        }
    }
}
