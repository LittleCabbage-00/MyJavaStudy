package JavaIOClass.FileClass;

import java.io.File;

//列出指定目录中所有的文件
public class MenuListClass {
    public static void main(String[] args) {
        //读D盘
        File f = new File("d:" + File.separator);
        //名称列入str数组
        String[] str=f.list();
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]+"\t");
        }

        System.out.println("");
        //完整路径
        File[] files=f.listFiles();
        for (int i = 0; i < files.length; i++) {
            System.out.print(files[i]+"\t");
        }
    }
}
