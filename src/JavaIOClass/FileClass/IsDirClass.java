package JavaIOClass.FileClass;

import java.io.File;

//判断路径是否是目录
public class IsDirClass {
    public static void main(String[] args) {
        File f = new File("d:" + File.separator + "ComputerProgram" + File.separator + "Desktop" );
        if (f.isDirectory()){
            System.out.println("is");
        }else {
            System.out.println("is not");
        }
    }
}
