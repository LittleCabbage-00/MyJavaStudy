package OOP.CodeBlock;
//静态代码块
class Demo0{        //定义构造块
    {
        System.out.println("1.make block");
    }
    static{         //定义静态代码块
        System.out.println("0.static block");
    }
    public Demo0(){ //定义构造方法
        System.out.println("3.make method");
    }
}
public class StaticBlock {
    static {        //在主方法所在类里面定义静态块
        System.out.println("make the code block in the main method");
    }
    public static void main(String[] args){
        new Demo0();
        new Demo0();
    }
    //静态代码块优先于主方法执行，而在类中定义的静态代码块会优先于构造块执行
    //且不管有多少个对象产生，静态代码只执行一次
}
