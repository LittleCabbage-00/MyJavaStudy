package OOP.MakeMethodPrivate;
//声明静态方法，取得 Singleton类的实例
class Singleton{
    private static Singleton instance=new Singleton();//在内部产生本类的实例化对象
    private Singleton() {                   //此处将构造方法进行封装
    }
    public static Singleton getInstance(){  //通过静态方法取得Singleton类的实例
            return instance;
        }
        public void print(){
            System.out.println("private,fuck you");
    }
}
public class Basal1 {
    public static void main(String[] args){
        Singleton s1=Singleton.getInstance();//访问类中的静态方法，取得对象实例
        s1.print();
        Singleton s2=Singleton.getInstance();
        s2.print();
    }
}
//从以上程序中可以发现虽然声明了2个Singleton对象
//但是实际上所有的对象都只使用instance引用
//也就是说，此时不管外面如何使用，最终结果也只是有一个实例化对象存在
//只要将构造方法私有化，就可以控制实例化对象的产生
