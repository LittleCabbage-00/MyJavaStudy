package OOPHighLevel.ObjectDulAttitude;
/**
 * 对象的多态性 向下转型
 * 在进行向下转型前必须首先发生对象的向上转型
 */
class C{
    public void fun1(){
        System.out.println("C-->void fun1()");
    }
    public void fun2(){
        this.fun1();
    }
}
class D extends C{
    public void fun1(){
        System.out.println("D-->void fun1()");
    }
    public void fun3(){
        System.out.println("D-->void fun3()");
    }
}
public class down {
    public static void main(String[] args){
        C c=new D();        //此处发生了向上转型的关系，子类-->父类
                            //新子类指向父类实例化对象
        D d=(D)c;           //此处发生了向下转型 关系
                            //父类实例化对象指向子类实例化对象
        d.fun1();           //调用方法被覆写的方法
        d.fun2();           //调用父类的方法
        d.fun3();           //调用子类自己定义的方法
    }
}
/*
  向下转型之后因为指的都是子类对象所以调用的方法全是子类的方法
  在父类和子类都有定义的方法时，被调用的是被子类覆写的方法
  向下转型就是子类-->子类
 */
