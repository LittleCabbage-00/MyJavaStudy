package OOP.CodeBlock;
//构造代码块
class Demo{
    {               //定义构造块
        System.out.println("1、make block");
    }
    public Demo(){  //定义构造方法
        System.out.println("2、make method");
    }
}
public class MakeBlock {
    public static void main(String[] args){
        new Demo();
    }
    //构造块优先构造方法运行，并且每次实例化对象时都会执行构造块的代码
}
