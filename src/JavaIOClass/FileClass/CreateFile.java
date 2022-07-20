package JavaIOClass.FileClass;

import java.io.File;

//使用file类创建新文件
public class CreateFile {
    public static void main(String[] args) {
        //File f = new File("d:\\ComputerProgram\\Desktop\\text.txt");
        //以上的路径可能会导致斜杠画错方向的问题，因此一般采用下面的写法
        File f = new File("d:" + File.separator + "ComputerProgram" + File.separator + "Desktop" + File.separator + "text_t.txt");
        try {
            f.createNewFile();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
