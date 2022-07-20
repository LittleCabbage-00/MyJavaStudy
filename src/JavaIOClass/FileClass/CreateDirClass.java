package JavaIOClass.FileClass;

import java.io.File;

//在指定位置创建文件夹
public class CreateDirClass {
    public static void main(String[] args) {
        File f = new File("d:" + File.separator + "ComputerProgram" + File.separator + "Desktop" + File.separator + "text");
        f.mkdir();

        try {
            Thread.sleep(5000);
        }catch (Exception e){
            System.out.println("error");
        }

        f.delete();
    }
}
