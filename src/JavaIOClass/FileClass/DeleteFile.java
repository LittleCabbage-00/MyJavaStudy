package JavaIOClass.FileClass;

import java.io.File;

//删除指定文件
public class DeleteFile {
    public static void main(String[] args) {
        File f = new File("d:" + File.separator + "ComputerProgram" + File.separator + "Desktop" + File.separator + "text_t.txt");
        if (f.exists()) {
            f.delete();
        }else {
            System.out.println("文件不存在");
        }
    }
}
