package JavaIOClass.PrintClass;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

//PrintStream输出
public class PrintDemo {
    public static void main(String[] args) throws Exception{
        PrintStream ps = new PrintStream(new FileOutputStream(new File("d:" + File.separator + "ComputerProgram" + File.separator + "Desktop" + File.separator + "text_t.txt")));

ps.print("ohhhhhh\n");
ps.println("java");
    }
}
