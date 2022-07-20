package OOPHighLevel.ErrorProcess;

public class try_catch_2 {
    public static void main(String[] args) {
        System.out.println("开始计算：");
        int i=0,j=0;
        try {
            String str1=args[0];
            String str2=args[1];
            i=Integer.parseInt(str1);
            j=Integer.parseInt(str2);
            int temp=i/j;
            System.out.println("i/j的值为："+temp);
            fenge(20);
        }
//        catch (Exception e){
//            System.out.println("其他异常："+e);
//            e.printStackTrace();
//        }
        catch (ArithmeticException e) {
            System.out.println("算术异常：" + e);
            e.printStackTrace();
        }
        catch (NumberFormatException e){
            System.out.println("数字转换异常：" + e);
            e.printStackTrace();
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组异常：" + e);
            e.printStackTrace();
    }
        finally {
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
