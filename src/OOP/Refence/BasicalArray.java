package OOP.Refence;
//字符串的引用传递
public class BasicalArray {
    public static void main(String[] args){
        String str1="something";
        System.out.println("before is :"+str1);
        fun(str1);
        System.out.println("after is :"+str1);
    }
    public static void fun(String str2){
        str2="nothing";
    }
    //字符串一经定义即不可修改，str2定义只是开辟了一个新内存空间放“nothing”
    //str1本身并没有发生改变，fun()方法把str2地址先指向了str1
    //然后断开了和str1的连接，改变了str2的引用，但是str1始终没有受到任何影响
}
