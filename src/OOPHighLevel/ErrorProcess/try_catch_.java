package OOPHighLevel.ErrorProcess;

import java.util.logging.Logger;

public class try_catch_ {
    public static void main(String[] args) {
        System.out.println("开始计算：");
        int i=0,j=0;
        try {
            int temp=i/j;
            System.out.println("i/j的值为："+temp);
            fenge(20);
        }catch (ArithmeticException e){
            //System.out.println("出现了一些异常问题："+e);
            e.printStackTrace();
        }finally {
            System.out.println("爷不管你有没有异常，都得给爷来这里过个场");
        }
        System.out.println("程序计算结束");
    }
    public static void fenge(int a){
        for (int i = 0; i < a; i++) {
            System.out.print("=");
        }
        System.out.println();
    }
}
