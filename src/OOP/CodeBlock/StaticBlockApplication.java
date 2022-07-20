package OOP.CodeBlock;
//静态代码块应用
public class StaticBlockApplication {
    static {
        System.out.println("some");
        System.exit(0);
    }
    //理论上是可以运行没有main函数的java程序的，但是高版本JDK不允许
    //因此需要建立一个空的main函数使其拥有一个入口
    public static void main(String[] args){

    }
}
