package Generics.GenericsMethod;
//泛型方法的定义
class demo{
    public <T> T fun(T t){
        return t;
    }
}
public class MakeMethod {
    public static void main(String[] args) {
        demo d = new demo();
        String str=d.fun("小明");
        int i=d.fun(30);
        double d1=d.fun(3.14);
        System.out.println(str);
        System.out.println(i);
        System.out.println(d1);
    }
}
/*
此方法可以接受任意类型的参数，并返回该类型的值。
 */
