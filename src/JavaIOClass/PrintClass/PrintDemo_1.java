package JavaIOClass.PrintClass;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

//类似c语言的格式化输出
public class PrintDemo_1 {
    public static void main(String[] args) throws Exception{
        PrintStream ps = new PrintStream(new FileOutputStream(new File("d:" + File.separator + "ComputerProgram" + File.separator + "Desktop" + File.separator + "text_t.txt")));

        String str="java";
        int age=20;
        float score =900.365f;
        char sex='n';

        ps.printf("姓名：%s，年龄：%d，分数：%f，性别：%c",str,age,score,sex);
        //不管类型，全变成%s也行
//        ps.printf("姓名：%s，年龄：%s，分数：%s，性别：%s",str,age,score,sex);
        ps.close();
    }
}
