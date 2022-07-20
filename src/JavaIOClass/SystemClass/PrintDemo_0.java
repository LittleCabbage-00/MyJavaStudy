package JavaIOClass.SystemClass;

import java.io.OutputStream;

//使用OutputStream向屏幕输出字符
public class PrintDemo_0 {
    public static void main(String[] args) {
        OutputStream out = System.out;
        try {
            out.write("some".getBytes());
            out.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
