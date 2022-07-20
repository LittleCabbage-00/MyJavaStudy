package JavaIOClass.FileClass;

import java.io.File;
import java.io.IOException;

//创建文件对象，存在就删除，不存在就创建出来
public class DelAndCreFileClass {
    public static void main(String[] args){
        File f = new File("d:" + File.separator + "ComputerProgram" + File.separator + "Desktop" + File.separator + "text_t.txt");
        if (f.exists()) {
            f.delete();
            System.out.println("已删除");
        }else {
            try{
            f.createNewFile();
            System.out.println("已创建");
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
