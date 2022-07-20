package OOPHighLevel.InterFaceKind;
/**
 * 接口（特殊的类） 基础
 * 接口里面默认为public访问权限，不管写没写public，都是public权限
 * interface A||class B implement A-->B类实现A接口
 * abstract C||class D extends C implements A-->D类继承C类并实现A接口
 * abstract E implement A-->抽象类E实现A接口
 */
interface A{                    //接口A
    public String name="Bom";   //public可以不写，此处定义了一个全局常量
    void print();
    String getInfo();
}
interface B{                    //接口B
    public void Speak();
}
class D implements A,B{         //包括接口A，B的类
    //一个子类可以实现多个接口，但是子类必须实现那些接口的全部抽象方法
    @Override
    public void Speak(){        //覆写B的抽象方法
        System.out.println("I'm normal");
    }
    @Override
    public String getInfo(){    //覆写A的抽象方法
        return "something";
    }
    @Override
    public void print() {       //覆写A的抽象方法
        System.out.println("stupid "+name);
    }
}
abstract class C{               //抽象类C
    public abstract void Kind();
}
abstract class F implements B{  //定义抽象类，实现接口
    public abstract void say();
}
class E extends C implements A,B{   //子类同时实现接口和抽象类
    @Override
    public void Kind() {
        System.out.println("E kind");
    }
    @Override
    public void print() {
        System.out.println("E print");
    }
    @Override
    public void Speak() {
        System.out.println("E Speak");
    }
    @Override
    public String getInfo() {
        return "E can extend and interface";
    }
}
class G extends F{                     //包含有接口的抽象类F的类G
    public void say(){
        System.out.println("G extend say F");
    }
    public void Speak(){
        System.out.println("G extend speak F");
    }
}
public class AboutInterFace {
    public static void main(String[] args){
        D d=new D();
        d.Speak();
        d.print();
        E e=new E();
        e.Kind();
        e.print();
        e.Speak();
        System.out.println(e.getInfo());
        G g=new G();
        g.say();
        g.Speak();
    }
}
