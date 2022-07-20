package OOP.InsideKind;
//在方法中定义类
class Outter2{
    private String info ="something new";
    public void fun(final int temp){//参数要被访问必须要final声明
        class Inner2{               //方法内定义类
            public void print(){
                System.out.println("类中的属性："+info);
                System.out.println("方法中的参数："+temp);
            }
        }
        new Inner2().print();
    }
}
public class MakeInnerInMethod {
    public static void main(String[] args){
        new Outter2().fun(30);//调用外部方法
    }
}
//也可以在方法中定义一个内部类
//但是在方法中定义的内部类不能直接访问方法中的参数
//如果方法中的参数要想被内部类所访问
//则参数前必须加上 final关键字。
