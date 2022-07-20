package OOPHighLevel.AbstractKind;
/**
 * 关于抽象类，基础
 * 抽象类就是专门用来当父类的模板
 * final的值改不了，final的类无法继承
 */
abstract class A{
    public static final String FLAG="CHINA";
    private String name="Jack";
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public abstract void print();
}
class B extends A{
    public void print(){
        System.out.println("FLAG: "+ FLAG);
        System.out.println("name: "+super.getName());
    }
}
class C extends A{              //子类可以修改父类的final引用，但是无法改变值
       public void print(){
        String name="Tom";
        String FLAG="JAPAN";
        System.out.println("FLAG: "+FLAG);
        System.out.println("name: "+name);
    }
}
public class AboutAbstract {
    public static void main(String[] args){
        B b=new B();
        b.print();
        C c=new C();
        c.print();
        //System.out.println(FLAG);
        System.out.println(C.FLAG);
    }
}
