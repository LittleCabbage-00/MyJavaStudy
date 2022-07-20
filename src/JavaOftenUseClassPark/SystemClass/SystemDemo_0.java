package JavaOftenUseClassPark.SystemClass;
//运算时间
public class SystemDemo_0 {
    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        int sum=0;

        for (int i = 0; i < 300000000; i++) {
            sum+=i;
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }
}
