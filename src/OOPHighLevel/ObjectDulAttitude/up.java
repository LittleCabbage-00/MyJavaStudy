package OOPHighLevel.ObjectDulAttitude;
//对象多态性 向上转型
class A{
    public void fun1(){
        System.out.println("A-->void fun1()");
    }
    public void fun2(){
        this.fun1();
    }
}
class B extends A{
    @Override
    public void fun1() {
        System.out.println("B-->void fun1()");
    }
    public void fun3() {
        System.out.println("B-->void fun3()");
    }
}
public class up {
    public static void main(String[] args){
        B b= new B();       //定义子类实例化对象
        A a=b;              //发生了向上转型的关系，子类--》父类
        //A a = new B();
        a.fun1();           //此方法被子类覆写
        new B().fun2();
    }
}
/*
  向上转型之后，父类无法调用父类未定义的方法，调用有定义并且子类也有的方法会被子类方法覆写
  向上转型之后会失去父类中没有定义的方法
  只能调用父类中定义的方法(子类重写父类 调用子类的方法)。
  A无法调用fun3()
 */
