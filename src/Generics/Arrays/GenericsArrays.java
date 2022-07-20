package Generics.Arrays;
//泛型数组
public class GenericsArrays {
    public static void main(String[] args) {
        Integer[] i=fun1(1,2,3,4,5,6);
        fun2(i);
    }
    public static <T> T[] fun1(T... t){
        return t;
    }
    public static <T> void fun2(T[] t){
        for(T t1:t){
            System.out.print(t1+" ");
        }
    }
}
/*
 以上程序从fun1方法中返回一个Integer数组
 然后将这个数组传递给fun2方法进行输出
 */